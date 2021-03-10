package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import java.lang.IllegalArgumentException
import java.leetcode.editor.en.definition.ListNode
import kotlin.collections.HashMap

public class P1_TwoSum {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        nums.forEachIndexed { index, num ->
            map[target-num]?.let { return intArrayOf(it, index) }
            map[num] = index
        }
        throw IllegalArgumentException()
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
