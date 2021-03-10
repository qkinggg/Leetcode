package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P78_Subsets {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {
        val ans = ArrayList<List<Int>>()
        ans.add(ArrayList())
        for (x in nums) {
            val size = ans.size
            for (i in 0 until size) {
                val sol = ArrayList(ans[i])
                sol.add(x)
                ans.add(sol)
            }
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
