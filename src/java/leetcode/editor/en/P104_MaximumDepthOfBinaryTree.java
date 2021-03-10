package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P104_MaximumDepthOfBinaryTree {
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
    private int ans = 0;
    public int maxDepth(TreeNode root) {
        dfs(root, 1);
        return ans;
    }
    private void dfs(TreeNode root, int level) {
        if (root == null) return;
        if (level > ans) ans = level;
        dfs(root.left, level+1);
        dfs(root.right, level+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
