package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P1137_NThTribonacciNumber {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun tribonacci(n: Int): Int {
        if (n == 0) return 0
        var dp1 = 0
        var dp2 = 1
        var dp3 = 1
        for (i in 3..n) {
            val dp4 = dp1 + dp2 + dp3
            dp1 = dp2
            dp2 = dp3
            dp3 = dp4
        }
        return dp3
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
