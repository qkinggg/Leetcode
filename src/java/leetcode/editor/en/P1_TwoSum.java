package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1_TwoSum {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int y = target - nums[i];
            if (m.containsKey(y)) return new int[] {m.get(y), i};
            m.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
