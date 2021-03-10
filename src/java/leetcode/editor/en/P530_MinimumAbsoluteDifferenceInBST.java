package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P530_MinimumAbsoluteDifferenceInBST {
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
    private Integer prev;
    private int ans = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (prev != null) ans = Math.min(ans, root.val-prev);
        prev = root.val;
        dfs(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
