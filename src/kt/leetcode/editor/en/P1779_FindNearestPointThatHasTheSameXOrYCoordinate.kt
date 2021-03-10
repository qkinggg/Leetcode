package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P1779_FindNearestPointThatHasTheSameXOrYCoordinate {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        val nearest = points.withIndex()
            .filter { (i, point) -> point[0] == x || point[1] == y }
            .minBy { (i, point) -> Math.abs(point[0]-x) + Math.abs(point[1]-y) }
        return nearest?.index ?: -1
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
