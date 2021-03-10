package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P40_CombinationSumII {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val ans = ArrayList<ArrayList<Int>>()
        val sol = ArrayList<Int>()
        candidates.sortedArray()
        /*  nested function begin */
        fun dfs(start: Int, sum: Int) {
            if (sum == target) {
                ans.add(ArrayList(sol))
                return
            }
            for (i in start until candidates.size) {
                if (sum + candidates[i] > target) return
                if (i > start && candidates[i] == candidates[i-1]) continue
                sol.add(candidates[i])
                dfs(i+1, sum + candidates[i])
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
