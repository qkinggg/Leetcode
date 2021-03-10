package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P987_VerticalOrderTraversalOfABinaryTree {
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
    fun verticalTraversal(root: TreeNode?): List<List<Int>> {
        val ans = ArrayList<ArrayList<Int>>()
        val map = TreeMap<Int, TreeMap<Int, PriorityQueue<Int>>>()
        /*  nested function begin */
        fun dfs(root: TreeNode?, x: Int, y: Int) {
            if (root == null) return
            map.putIfAbsent(x, TreeMap())
            map[x]!!.putIfAbsent(y, PriorityQueue())
            map[x]!![y]!!.add(root.`val`)
            dfs(root.left, x-1, y+1)
            dfs(root.right, x+1, y+1)
        }
        /*  nested function end */
        dfs(root, 0, 0)
        map.values.forEach { mapByX ->
            ans.add(ArrayList())
            mapByX.values.forEach { pq ->
                while (pq.isNotEmpty()) ans.last().add(pq.poll())
            }
        }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
