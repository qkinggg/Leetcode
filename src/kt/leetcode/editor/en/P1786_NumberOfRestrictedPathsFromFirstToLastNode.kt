package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.ArrayDeque
import kotlin.collections.HashMap

public class P1786_NumberOfRestrictedPathsFromFirstToLastNode {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun countRestrictedPaths(n: Int, edges: Array<IntArray>): Int {
        // build adjacency list
        val graph = Array(n+1) { HashMap<Int, Int>() }
        for ((i, j, w) in edges) {
            graph[i][j] = w
            graph[j][i] = w
        }
        // Dijkstra
        val comparator = compareBy<Pair<Int, Int>> { it.first }
        val pq = PriorityQueue(comparator)
        val dist = IntArray(n+1) { Int.MAX_VALUE }
        pq.add(Pair(0, n))
        dist[n] = 0
        while (pq.isNotEmpty()) {
            val (d, cur) = pq.poll()
            for ((neighbour, w) in graph[cur]) {
                if (dist[neighbour] > d + w) {
                    dist[neighbour] = d + w
                    pq.add(Pair(d + w, neighbour))
                }
            }
        }
        // dp + dfs
        val dp = IntArray(n + 1) {-1}
        /*  nested function begin */
        fun dfs(cur: Int): Int {
            if (cur == n) return 1
            if (dp[cur] != -1) return dp[cur]
            var count = 0
            for ((neighbour, _) in graph[cur])
                if (dist[cur] > dist[neighbour]) {
                    count += dfs(neighbour)
                    count %= (1E9+7).toInt()
                }
            dp[cur] = count
            return count
        }
        /*  nested function end */
        return dfs(1)
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
