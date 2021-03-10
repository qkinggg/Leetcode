package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.HashMap

public class P1781_SumOfBeautyOfAllSubstrings {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun beautySum(s: String): Int {
        var ans = 0
        for (i in 0 until s.length) {
            val count = IntArray(26)
            for (j in i until s.length) {
                count[s[j]-'a']++
                var max = Int.MIN_VALUE
                var min = Int.MAX_VALUE
                for (x in count) {
                    if (x == 0) continue
                    max = Math.max(max, x)
                    min = Math.min(min, x)
                }
                ans += max - min
            }
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
