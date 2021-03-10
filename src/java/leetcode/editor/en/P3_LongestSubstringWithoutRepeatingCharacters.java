package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P3_LongestSubstringWithoutRepeatingCharacters {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0, lb = -1;
        Map<Character, Integer> m = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int before = (m.containsKey(s.charAt(i))) ? m.get(s.charAt(i)) : -1;
            lb = Math.max(lb, before);
            // System.out.println(s.substring(lb+1, i+1));
            ans = Math.max(ans, i-lb);
            m.put(s.charAt(i), i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
