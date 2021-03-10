package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P144_BinaryTreePreorderTraversal {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun preorderTraversal(root: TreeNode?): List<Int> {
        val ans = ArrayList<Int>()
        val stack = ArrayDeque<TreeNode>()
        root?.let { stack.push(it) }
        while (stack.isNotEmpty()) {
            val node = stack.pop()
            ans.add(node.`val`)
            node.right?.let { stack.push(it) }
            node.left?.let { stack.push(it) }
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
