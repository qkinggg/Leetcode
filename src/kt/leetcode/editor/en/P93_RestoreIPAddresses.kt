package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P93_RestoreIPAddresses {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun restoreIpAddresses(s: String): List<String> {
        if (s.length > 12) return listOf()
        val dp = HashMap<Int, HashMap<Int, ArrayList<String>>>()
        /*  nested function begin */
        fun dfs(depth: Int, start: Int) {
            if (dp[depth] != null && dp[depth]!![start] != null) return
            dp.putIfAbsent(depth, HashMap())
            dp[depth]!!.putIfAbsent(start, ArrayList())
            if (depth == 3) {
                val cur = s.substring(start)
                if (cur.isValid()) dp[depth]!![start]!!.add(cur)
            } else {
                for (i in 1..3) {
                    if (start + i > s.length) break
                    val cur = s.substring(start, start + i)
                    if (!cur.isValid()) break
                    dfs(depth + 1, start + i)
                    for (sub in dp[depth + 1]!![start + i]!!) {
                        dp[depth]!![start]!!.add("$cur.$sub")
                    }
                }
            }
        }
        /*  nested function end */
        dfs(0, 0)
        return dp[0]!![0]!!
    }
    private fun String.isValid(): Boolean {
        if (this == "" || length > 3) return false
        if (this[0] == '0' && length > 1) return false
        if (length == 3 && this > "255") return false
        return true
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}