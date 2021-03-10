package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P121_BestTimeToBuyAndSellStock {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun maxProfit(prices: IntArray): Int {
        var ans = 0
        var low = prices[0]
        for (i in 1 until prices.size) {
            ans = Math.max(ans, prices[i] - low)
            low = Math.min(low, prices[i])
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
