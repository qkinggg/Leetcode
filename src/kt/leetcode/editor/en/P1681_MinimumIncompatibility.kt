package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P1681_MinimumIncompatibility {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun minimumIncompatibility(nums: IntArray, k: Int): Int {
        // dp[mask][j] := min cost to distribute numbers (as a binary mask) and last number is j
        TODO()
        /*
        val n = nums.size
        val dp = Array(1 shl n) {IntArray(n) {0x7fffffff} }
        for (i in 0 until n)
        for (i in 0 until n) {
            for (mask in 0 until 1 shl i)
                for (j in 0 until n) {
                    dp[mask or (1 shl i)][j] = dp[mask][j]
                }
        }
        */
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
