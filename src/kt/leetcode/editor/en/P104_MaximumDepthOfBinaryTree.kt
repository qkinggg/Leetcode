package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P104_MaximumDepthOfBinaryTree {
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
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return 0
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
