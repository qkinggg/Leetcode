package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1781_SumOfBeautyOfAllSubstrings {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int beautySum(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            TreeMap<Integer, Integer> freqCount = new TreeMap<>();
            for (int j = i; j < s.length(); j++) {
                int f = freq[s.charAt(j) - 'a']++;
                freqCount.putIfAbsent(f+1, 0);
                freqCount.put(f+1, freqCount.get(f+1) + 1);
                if (f > 0) {
                    freqCount.put(f, freqCount.get(f) - 1);
                    if (freqCount.get(f) == 0) freqCount.remove(f);
                }
                ans += freqCount.lastKey() - freqCount.firstKey();
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
