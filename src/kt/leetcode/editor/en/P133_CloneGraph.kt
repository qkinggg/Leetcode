package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P133_CloneGraph {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var neighbors: ArrayList<Node?> = ArrayList<Node?>()
 * }
 */

class Solution {
    private val map = HashMap<Node, Node>()
    fun cloneGraph(node: Node?): Node? {
        if (node == null) return null
        if (map[node] == null) {
            map[node] = Node(node.`val`)
            for (child in node.neighbors) {
                map[node]!!.neighbors.add(cloneGraph(child)!!)
            }
        }
        return map[node]
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
