package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P516_LongestPalindromicSubsequence {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindromeSubseq(String s) {
        int[] dp = new int[s.length()];
        int[] prev = new int[s.length()];
        int tmp = 0;
        for (int i = s.length()-1; i >= 0; i--)
            for (int j = i; j < s.length(); j++) {
                if (i == j) dp[j] = 1;
                else if (s.charAt(i) == s.charAt(j)) dp[j] = Math.max(dp[j], tmp+2);
                else dp[j] = Math.max(prev[j], dp[j-1]);
                tmp = prev[j]; // store prev[j-1]
                prev[j] = dp[j];
            }
        return dp[s.length()-1];
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
