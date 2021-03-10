package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P140_WordBreakII {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun wordBreak(s: String, wordDict: List<String>): List<String> {
        val mapByLength = wordDict.groupBy { it.length }
        val dp = HashMap<Int, ArrayList<String>>()
        /*  nested function begin */
        fun dfs(start: Int) {
            if (dp[start] != null) return
            dp[start] = ArrayList()
            if (start == s.length) {
                dp[start]!!.add("")
                return
            }
            mapByLength.forEach { (len, list) ->
                if (start + len > s.length) return@forEach
                val cur = s.substring(start, start + len)
                if (cur in list) {
                    dfs(start + len)
                    for (sub in dp[start + len]!!) {
                        if (sub == "")
                            dp[start]!!.add("$cur")
                        else
                            dp[start]!!.add("$cur $sub")
                    }
                }
            }
        }
        /*  nested function end */
        dfs(0)
        return dp[0]!!
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
