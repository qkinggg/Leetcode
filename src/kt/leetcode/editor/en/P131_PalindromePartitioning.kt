package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.ArrayList
import kotlin.system.*


public class P131_PalindromePartitioning {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun partition(s: String): List<List<String>> {
        val ans = ArrayList<ArrayList<String>>()
        val path = ArrayList<String>()
        /*  nested function begin */
        fun isPalindrome(start: Int, end: Int): Boolean {
            var left = start
            var right = end
            while (left < right)
                if (s[left++] != s[right--]) return false
            return true
        }
        fun dfs(start: Int) {
            if (start == s.length) {
                ans.add(ArrayList(path))
                return
            }
            for (i in start+1..s.length) {
                if (isPalindrome(start, i-1)) {
                    path.add(s.substring(start, i))
                    dfs(i)
                    path.removeAt(path.lastIndex)
                }
            }
        }
        /*  nested function end */
        dfs(0)
        return ans
    }
    /*
    fun partition(s: String): List<List<String>> {
        /*  nested function begin */
        fun isPalindrome(start: Int, end: Int): Boolean {
            var left = start
            var right = end
            while (left < right)
                if (s[left++] != s[right--]) return false
            return true
        }
        /*  nested function end */
        val dp = Array(s.length+1) { ArrayList<ArrayList<String>>() }
        for (len in 1..s.length) {
            for (i in 0 until len) {
                if (!isPalindrome(i, len-1)) continue
                val cur = s.substring(i, len)
                if (i == 0)
                    dp[len].add(arrayListOf(cur))
                for (sub in dp[i]) {
                    dp[len].add(ArrayList(sub))
                    dp[len].last().add(cur)
                }
            }
        }
        return dp[s.length]
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)
}


fun main() {
    val sol = P131_PalindromePartitioning.Solution()
    val input = ArrayList<String>()
    for (i in 1..1000) {
        var s = ""
        for (j in 1..16) {
            s += ('a'..'z').random()
        }
        input.add(s)
    }

    val executionTime = measureTimeMillis {
        for (s in input) {
            sol.partition(s)
        }
    }
    println(executionTime)
}
