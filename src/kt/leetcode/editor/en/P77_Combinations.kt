package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P77_Combinations {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {
        val ans = ArrayList<ArrayList<Int>>()
        val sol = ArrayList<Int>()
        /*  nested function begin */
        fun dfs(start: Int) {
            if (sol.size == k) {
                ans.add(ArrayList(sol))
                return
            }
            for (i in start..n) {
                sol.add(i)
                dfs(i + 1)
                sol.removeAt(sol.lastIndex)
            }
        }
        /*  nested function end */
        dfs(1)
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
