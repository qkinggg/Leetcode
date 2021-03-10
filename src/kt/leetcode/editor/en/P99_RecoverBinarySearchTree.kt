package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P99_RecoverBinarySearchTree {
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
    fun recoverTree(root: TreeNode?): Unit {
        var prev: TreeNode? = null
        val inverse = ArrayList<TreeNode>()
        /*  nested function begin */
        fun dfs(root: TreeNode?) {
            if (root == null || inverse.size == 4) return
            dfs(root.left)
            prev?.let {
                if (root.`val` <= it.`val`) {
                    inverse.add(it)
                    inverse.add(root)
                }
            }
            prev = root
            dfs(root.right)
        }
        /*  nested function end */
        dfs(root)
        inverse.first().`val` = inverse.last().`val`.apply { inverse.last().`val` = inverse.first().`val` }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
