package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P39_CombinationSum {
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = ArrayList<List<Int>>()
        val sol = ArrayList<Int>()
        candidates.sortedArray()
        /*  nested function begin */
        fun dfs(start: Int, sum: Int) {
            if (sum == target) {
                ans.add(sol.toList())
                return
            }
            for (i in start until candidates.size) {
                if (sum + candidates[i] > target) return
                sol.add(candidates[i])
                dfs(i, sum + candidates[i])
                sol.removeLast()
            }
        }
        /*  nested function end */
        dfs(0, 0)
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
