package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P965_UnivaluedBinaryTree {
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
    private boolean ans = true;
    public boolean isUnivalTree(TreeNode root) {
        if (root == null) return ans;
        final Integer val = root.val;
        dfs(root, val);
        return ans;
    }
    private void dfs(TreeNode root, Integer val) {
        if (root == null || !ans) return;
        if (root.val != val) ans = false;
        dfs(root.left, val);
        dfs(root.right, val);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
