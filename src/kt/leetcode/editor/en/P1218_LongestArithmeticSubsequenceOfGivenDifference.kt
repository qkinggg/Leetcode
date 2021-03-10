package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.HashMap

public class P1218_LongestArithmeticSubsequenceOfGivenDifference {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun longestSubsequence(arr: IntArray, difference: Int): Int {
        val dp = IntArray(40001) // dp[i] := #LAS which last element is i-20000
        var ans = 1
        for (x in arr) {
            dp[x+20000] = dp[x+20000-difference] + 1
            ans = Math.max(ans, dp[x+10000])
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
