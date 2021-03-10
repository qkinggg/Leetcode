package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P1784_CheckIfBinaryStringHasAtMostOneSegmentOfOnes {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun checkOnesSegment(s: String): Boolean {
        return s.zipWithNext().all { it != Pair('0', '1') }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
