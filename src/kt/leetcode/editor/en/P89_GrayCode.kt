package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.ArrayList

public class P89_GrayCode {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun grayCode(n: Int): List<Int> {
        var ans: List<Int>? = null
        val sol = ArrayList<Int>()
        val visited = BooleanArray(1 shl n)
        /*  nested function begin */
        fun dfs() {
            if (sol.size == 1 shl n) {
                ans = sol.toList()
            }
            if (ans != null) return
            for (i in 0 until n) {
                val next = (sol.lastOrNull() ?: 1) xor (1 shl i)
                if (visited[next]) continue
                visited[next] = true
                sol.add(next)
                dfs()
                sol.removeAt(sol.lastIndex)
                visited[next] = false
            }
        }
        /*  nested function end */
        dfs()
        return ans!!
    }
    /*
    fun grayCode(n: Int): List<Int> {
        if (n == 0) {
            return listOf(0)
        }
        val l = grayCode(n - 1)
        val base = 1 shl (n - 1)
        println(l.reversed().map { it + base })
        return l + l.reversed().map { it + base }
    }*/
    /*
    fun grayCode(n: Int): List<Int> = (0 until (1 shl n)).map{ it xor (it shr 1) }*/
}
//leetcode submit region end(Prohibit modification and deletion)
}
