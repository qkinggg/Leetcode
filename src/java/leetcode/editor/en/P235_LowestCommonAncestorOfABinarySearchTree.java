package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P235_LowestCommonAncestorOfABinarySearchTree {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val > Math.max(p.val, q.val)) return lowestCommonAncestor(root.left, p, q);
        if (root.val < Math.min(p.val, q.val)) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
