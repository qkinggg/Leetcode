package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.HashMap

public class P139_WordBreak {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        var ans = false
        val mapByLength = wordDict.groupBy { it.length }
        val visited = BooleanArray(s.length)
        /*  nested function begin */
        fun dfs(start: Int) {
            if (start == s.length) ans = true
            if (visited[start] || ans) return
            mapByLength.forEach { (len, list) ->
                if (start + len > s.length) return@forEach
                val cur = s.substring(start, start + len)
                if (cur in list)
                    dfs(start + len)
            }
            visited[start] = true
        }
        /*  nested function end */
        dfs(0)
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
