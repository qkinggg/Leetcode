package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P746_MinCostClimbingStairs {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        var dp1 = cost[0]
        var dp2 = cost[1]
        for (i in 2 until cost.size) {
            val dp3 = Math.min(dp1, dp2) + cost[i]
            dp1 = dp2
            dp2 = dp3
        }
        return Math.min(dp1, dp2)
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
