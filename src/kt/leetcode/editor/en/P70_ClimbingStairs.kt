package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P70_ClimbingStairs {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun climbStairs(n: Int): Int {
        var dp1 = 1
        var dp2 = 1
        for (i in 2..n) {
            val dp3 = dp1 + dp2
            dp1 = dp2
            dp2 = dp3
        }
        return dp2
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
