package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1775_EqualSumArraysWithMinimumNumberOfOperations {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        if (nums1.length > 6 * nums2.length || 6 * nums1.length < nums2.length) return -1;
        int sum1 = 0, sum2 = 0;
        for (int x : nums1) sum1 += x;
        for (int x : nums2) sum2 += x;
        int[] count = new int[6];
        if (sum1 < sum2) {
            for (int x :nums1) count[6-x]++; // change x to 6
            for (int x :nums2) count[x-1]++; // change x to 1
        } else {
            for (int x :nums1) count[x-1]++;
            for (int x :nums2) count[6-x]++;
        }
        int diff = Math.abs(sum1 - sum2);
        int ans = 0;
        for (int i = 5; i >= 1; i--) {
            if (diff <= count[i] * i) {
                ans += Math.ceil((double) diff / i);
                break;
            }
            ans += count[i];
            diff -= count[i] * i;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
