package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P303_RangeSumQueryImmutable {
//leetcode submit region begin(Prohibit modification and deletion)

class NumArray(nums: IntArray) {
    val sum: List<Int>
    init {
        sum = nums.asIterable().cumSum(0) { sum, element -> sum + element }
    }

    fun sumRange(i: Int, j: Int): Int {
        return sum[j+1] - sum[i]
    }

    private inline fun <T, R> Iterable<T>.cumSum(initial: R, operation: (acc: R, T) -> R) : List<R> {
        val arr = mutableListOf(initial)
        var accumulator = initial
        for (element in this) {
            accumulator = operation(accumulator, element)
            arr.add(accumulator)
        }
        return arr
    }
}
/**
 * Your NumArray object will be instantiated and called as such:
 * var obj = NumArray(nums)
 * var param_1 = obj.sumRange(i,j)
 */
//leetcode submit region end(Prohibit modification and deletion)
}
