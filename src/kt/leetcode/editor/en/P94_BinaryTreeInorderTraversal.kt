package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import kotlin.collections.ArrayList

public class P94_BinaryTreeInorderTraversal {
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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        val ans = ArrayList<Int>()
        val stack = ArrayDeque<TreeNode>()
        var cur = root
        while (stack.isNotEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur)
                cur = cur.left
            }
            cur = stack.pop()
            ans.add(cur.`val`)
            cur = cur.right
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
