package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P853_CarFleet {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Map<Integer, Double> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for (int i = 0; i < position.length; i++)
            map.put(position[i], ((double) (target-position[i])/speed[i]));
        int ans = 0;
        Double max = Double.MIN_VALUE;
        for (Double sec : map.values()) {
            if (sec > max) { ans += 1; max = sec; }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
