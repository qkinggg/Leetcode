package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P1782_CountPairsOfNodes {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun countPairs(n: Int, edges: Array<IntArray>, queries: IntArray): IntArray {
        // build adjacency list
        val graph = ArrayList<HashMap<Int, Int>>(n+1)
        val degree = IntArray(n+1)
        for (i in 0..n) {
            graph.add(HashMap())
        }
        for (e in edges) {
            val (i, j) = e.sortedArray() // [1, 2] eq [2, 1]
            graph[i][j] = (graph[i][j] ?: 0) + 1
            degree[i]++
            degree[j]++
        }
        // solve by query
        val sort = degree.copyOf().sortedArray()
        val ans = IntArray(queries.size)
        queries.forEachIndexed { index, query ->
            var left = 1
            var right = n
            while (left < right) {
                if (query < sort[left] + sort[right]) {
                    ans[index] += (right--) - left
                } else {
                    left++
                }
            }
            for (i in 1..n)
                for ((j, w) in graph[i]) {
                    val total = degree[i] + degree[j]
                    if (total > query && total - graph[i][j]!! <= query) {
                        ans[index]--
                    }
                }
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
