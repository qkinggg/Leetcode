package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P687_LongestUnivaluePath {
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
    private int ans;
    public int longestUnivaluePath(TreeNode root) {
        longestFromRoot(root);
        return ans;
    }
    private int longestFromRoot(TreeNode root) {
        if (root == null) return 0;
        int L = longestFromRoot(root.left) * ((root.left != null && root.val == root.left.val) ? 1 : 0);
        int R = longestFromRoot(root.right) * ((root.right != null && root.val == root.right.val) ? 1 : 0);
        ans = Math.max(ans, L + R);
        return Math.max(L, R) + 1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
