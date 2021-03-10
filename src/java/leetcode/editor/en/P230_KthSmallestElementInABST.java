package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P230_KthSmallestElementInABST {
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
    private int index;
    private int ans;
    public int kthSmallest(TreeNode root, int k) {
        index = k;
        dfs(root);
        return ans;
    }
    private void dfs(TreeNode root) {
        if (root == null) return;
        dfs(root.left);
        if (--index == 0) ans = root.val;
        dfs(root.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
