package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P337_HouseRobberIII {
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
    public int rob(TreeNode root) {
        int[] ans = dfs(root);
        return Math.max(ans[0], ans[1]);
    }
    // [0]: robRoot, [1]: notRobRoot
    private int[] dfs(TreeNode root) {
        if (root == null) return new int[] {0,0};
        int[] L = dfs(root.left);
        int[] R = dfs(root.right);
        int[] res = new int[2];
        res[0] = root.val + L[1] + R[1];
        res[1] = Math.max(L[0], L[1]) + Math.max(R[0], R[1]);
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
