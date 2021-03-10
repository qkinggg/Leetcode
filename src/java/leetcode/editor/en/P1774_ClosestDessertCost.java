package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1774_ClosestDessertCost {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int ans;
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        ans = baseCosts[0];
        for (int x : baseCosts) {
            dfs(x, 0, toppingCosts, target);
        }
        return ans;
    }
    private void dfs(int sum, int cur, int[] toppingCosts, int target) {
        if (cur == toppingCosts.length) {
            if (Math.abs(target-sum) < Math.abs(target-ans)) ans = sum;
            else if (Math.abs(target-sum) == Math.abs(target-ans)) ans = Math.min(ans, sum);
            return;
        }
        dfs(sum, cur+1, toppingCosts, target);
        dfs(sum + toppingCosts[cur], cur+1, toppingCosts, target);
        dfs(sum + toppingCosts[cur]*2, cur+1, toppingCosts, target);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
