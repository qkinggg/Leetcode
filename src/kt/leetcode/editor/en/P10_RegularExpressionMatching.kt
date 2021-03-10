package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P10_RegularExpressionMatching {
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun isMatch(s: String, p: String): Boolean {
        /*  nested function begin */
        fun isMatch(sidx: Int, pidx: Int): Boolean {
            if (pidx == p.length) return sidx == s.length
            if (pidx + 1 < p.length && p[pidx+1] == '*') {  // ' *' pattern
                if (isMatch(sidx, pidx+2)) return true
                if (sidx < s.length && s[sidx] == p[pidx] || s[sidx] == '.') {
                    return isMatch(sidx + 1, pidx)
                }
            } else if (sidx < s.length && s[sidx] == p[pidx] || s[sidx] == '.') {
                return isMatch(sidx+1, pidx+1)
            }
            return false
        }
        /*  nested function end */
        return isMatch(0, 0)
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
