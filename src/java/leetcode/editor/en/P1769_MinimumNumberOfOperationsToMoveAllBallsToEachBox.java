package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1769_MinimumNumberOfOperationsToMoveAllBallsToEachBox {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for (int i = 0; i < boxes.length(); i++)
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(i) == '1')ans[j] += Math.abs(i-j);
            }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
