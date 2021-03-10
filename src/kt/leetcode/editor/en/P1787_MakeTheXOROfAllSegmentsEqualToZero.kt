package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

public class P1787_MakeTheXOROfAllSegmentsEqualToZero {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun minChanges(nums: IntArray, k: Int): Int {
        var dp1 = IntArray(1025) { 0x7fffffff }
        dp1[0] = 0
        for (i in 1..k) {
            // groupby %k and count occurrences
            val freq = HashMap<Int, Int>()  // (num, count)
            var total = 0
            for (j in i-1 until nums.size step k) {
                freq[nums[j]] = (freq[nums[j]] ?: 0) + 1
                total++
            }
            // dp[i][j]:= minimum elements to change s.t. (XOR of first i element) == j
            // dp2 = dp[i], dp1 = dp[i-1]
            val m = dp1.min()!!
            val dp2 = IntArray(1025) { m + total }
            for (j in 0..1024) {
                for ((num, count) in freq) {
                    if (j xor num > 1024) continue
                    dp2[j] = Math.min(dp2[j], dp1[j xor num] + total - count)
                }
            }
            dp1 = dp2
        }
        return dp1[0]
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
