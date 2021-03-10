package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.math.pow

public class P1780_CheckIfNumberIsASumOfPowersOfThree {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun checkPowersOfThree(n: Int): Boolean {
        var ans = false
        /*  nested function begin */
        fun dfs(depth: Int, sum:Int) {
            if (sum == n || ans) {
                ans = true
                return
            }
            for (i in depth..100) {
                val new = sum + (3 pow i)
                if (new > n) return
                dfs(i+1, new)
            }
        }
        /*  nested function end */
        dfs(0, 0)
        return ans
    }
    private infix fun Int.pow(exp: Int): Int {
        var res = 1;
        repeat(exp) { res *= this }
        return res
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
