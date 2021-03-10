package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P979_DistributeCoinsInBinaryTree {
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
    public int distributeCoins(TreeNode root) {
        int[] ans = dfs(root);
        return ans[0];
    }
    // [0]: distributeCoins, [1]: residual
    private int[] dfs(TreeNode root) {
        if (root == null) return new int[] {0,0};
        int[] L = dfs(root.left);
        int[] R = dfs(root.right);
        int[] res = new int[2];
        res[0] = L[0] + R[0] + Math.abs(L[1]) + Math.abs(R[1]);
        res[1] = L[1] + R[1] + (root.val-1);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
