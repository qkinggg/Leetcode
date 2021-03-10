package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P589_NAryTreePreorderTraversal {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a Node.
 * class Node(var `val`: Int) {
 *     var children: List<Node?> = listOf()
 * }
 */

class Solution {
    fun preorder(root: Node?): List<Int> {
        val ans = ArrayList<Int>()
        /*  nested function begin */
        fun dfs(root: Node?) {
            if (root == null) return
            ans.add(root.`val`)
            root.children.forEach { dfs(it) }
        }
        /*  nested function end */
        dfs(root)
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
