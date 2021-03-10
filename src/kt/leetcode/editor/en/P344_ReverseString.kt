package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P344_ReverseString {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun reverseString(s: CharArray): Unit {
        for (i in 0 until s.size/2) {
            s[i] = s[s.lastIndex - i].apply { s[s.lastIndex - i] = s[i] }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
