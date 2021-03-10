package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P1302_DeepestLeavesSum {
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
    fun deepestLeavesSum(root: TreeNode?): Int {
        var ans = 0
        var maxDepth = -1
        /*  nested function begin */
        fun dfs(root: TreeNode?, depth: Int) {
            if (root == null) return
            if (root.left == null && root.right == null) {
                if (depth > maxDepth) {
                    maxDepth = depth
                    ans = 0
                }
                if (depth == maxDepth) ans += root.`val`
            }
            dfs(root.left, depth+1)
            dfs(root.right, depth+1)
        }
        /*  nested function end */
        dfs(root, 0)
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
