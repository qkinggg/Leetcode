package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P124_BinaryTreeMaximumPathSum {
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
    private int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxFromRoot(root);
        return ans;
    }
    private int maxFromRoot(TreeNode root) {
        if (root == null) return 0;
        int L = Math.max(maxFromRoot(root.left), 0);
        int R = Math.max(maxFromRoot(root.right), 0);
        ans = Math.max(ans, root.val + L + R);
        return root.val + Math.max(L, R);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
