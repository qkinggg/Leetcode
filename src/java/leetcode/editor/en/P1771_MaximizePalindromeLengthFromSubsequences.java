package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1771_MaximizePalindromeLengthFromSubsequences {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindrome(String word1, String word2) {
        String s = word1 + word2;
        int [] dp = new int[s.length()];
        int [] prev = new int[s.length()];
        int ans = 0, tmp = 0;
        for (int i = s.length()-1; i >= 0; i--)
            for (int j = i; j < s.length(); j++) {
                if (i == j) dp[j] = 1;
                else if (s.charAt(i) == s.charAt(j)) {
                    dp[j] = Math.max(dp[j], tmp+2);
                    if (i < word1.length() && j >= word1.length()) ans = Math.max(ans, dp[j]);
                }
                else dp[j] = Math.max(prev[j], dp[j-1]);
                tmp = prev[j]; // store prev[j-1]
                prev[j] = dp[j];
            }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
