package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.HashMap

public class P3_LongestSubstringWithoutRepeatingCharacters {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var ans = 0
        var left = -1
        val map = HashMap<Char, Int>()
        s.forEachIndexed { right, ch ->
            left = Math.max(left, map[ch] ?: -1)
            ans = Math.max(ans, right - left)
            map[ch] = right
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
