package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P701_InsertIntoABinarySearchTree {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val < val) root.left = insertIntoBST(root.right, val);
        else root.right = insertIntoBST(root.left, val);
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
