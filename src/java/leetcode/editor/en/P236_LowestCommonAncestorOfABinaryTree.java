package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P236_LowestCommonAncestorOfABinaryTree {
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
        if (root == null || root == p || root == q) return root;
        TreeNode L = lowestCommonAncestor(root.left, p ,q);
        TreeNode R = lowestCommonAncestor(root.right, p ,q);
        if (L != null && R != null) return root;
        return (L == null) ? R : L;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
