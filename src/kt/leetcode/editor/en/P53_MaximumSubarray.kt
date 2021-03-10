package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P53_MaximumSubarray {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun maxSubArray(nums: IntArray): Int {
        // dp[i] =: (MSA which last element is nums[i]).sum()
        var ans = nums[0]
        var dp1 = 0
        for (x in nums) {
            val dp2 = (if (dp1 > 0) dp1 else 0) + x
            ans = Math.max(ans,dp2)
            dp1 = dp2
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
