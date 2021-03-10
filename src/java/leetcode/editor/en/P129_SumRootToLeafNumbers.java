package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P129_SumRootToLeafNumbers {
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
    public int sumNumbers(TreeNode root) {
        dfs(root, 0);
        return ans;
    }
    private void dfs (TreeNode root, int prefix) {
        if (root == null) return;
        prefix = prefix * 10 + root.val;
        if (root.left == null && root.right == null) ans += prefix;
        dfs(root.left, prefix);
        dfs(root.right, prefix);
        prefix /= 10;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
