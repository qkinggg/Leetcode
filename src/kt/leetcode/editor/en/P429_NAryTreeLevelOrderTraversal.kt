package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P429_NAryTreeLevelOrderTraversal {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun levelOrder(root: Node?): List<List<Int>> {
        val ans = ArrayList<ArrayList<Int>>()
        val queue = ArrayDeque<Node>()
        root?.let { queue.offer(it) }
        while (queue.isNotEmpty()) {
            var size = queue.size
            ans.add(ArrayList())
            while (size-- != 0) {
                val node = queue.poll()
                ans.last().add(node.`val`)
                node.children.forEach { queue.offer(it) }
            }
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
