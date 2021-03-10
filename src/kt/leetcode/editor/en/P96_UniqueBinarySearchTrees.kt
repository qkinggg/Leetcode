package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P96_UniqueBinarySearchTrees {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun numTrees(n: Int): Int {
        return nums[n]
    }
    private val nums by lazy {
        println("this will be only called once...")
        val dp = IntArray(20)
        dp[0] = 1
        for (i in 1..19) {
            var total = 0
            for (j in 1..i) {
                total += dp[j-1] * dp[i-j]
            }
            dp[i] = total
        }
        dp
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}

fun main() {
    val sol = P96_UniqueBinarySearchTrees.Solution()
    println("before calculating")
    println(sol.numTrees(19))
    println(sol.numTrees(18))
    println(sol.numTrees(17))
}