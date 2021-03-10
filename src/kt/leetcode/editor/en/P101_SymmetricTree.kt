package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P101_SymmetricTree {
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
    fun isSymmetric(root: TreeNode?): Boolean {
        /*  nested function begin */
        fun isSymmetric(p: TreeNode?, q: TreeNode?): Boolean {
            if (p == null || q == null) return p == q
            return p.`val` == q.`val` && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left)
        }/*  nested function end */
        return isSymmetric(root, root)
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
