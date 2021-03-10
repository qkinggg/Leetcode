package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1770_MaximumScoreFromPerformingMultiplicationOperations {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        final int m = multipliers.length;
        int ans = Integer.MIN_VALUE;
        int [][] dp = new int[m+2][m+2];
        for (int i = 1; i <= m+1; i++)
            for (int j = 1; j <= m+2-i; j++) {
                if (i == 1 && j == 1) continue;
                int mul = multipliers[i+j-3];
                if (i == 1) dp[i][j] = dp[i][j-1] + mul * nums[j-2];
                else if (j == 1) dp[i][j] = dp[i-1][j] + mul * nums[nums.length-i+1];
                else dp[i][j] = Math.max(dp[i][j-1] + mul * nums[j-2], dp[i-1][j] + mul * nums[nums.length-i+1]);
                if (i+j == m+2) ans = Math.max(ans, dp[i][j]);
            }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
