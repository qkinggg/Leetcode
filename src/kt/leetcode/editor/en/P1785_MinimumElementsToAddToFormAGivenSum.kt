package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.math.abs
import kotlin.math.ceil

public class P1785_MinimumElementsToAddToFormAGivenSum {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun minElements(nums: IntArray, limit: Int, goal: Int): Int {
        var sum = .0
        for (i in nums)
            sum += i
        return Math.ceil(Math.abs(sum - goal) / limit).toInt()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
