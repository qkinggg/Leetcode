package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P257_BinaryTreePaths {
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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(root, sb, ans);
        return ans;
    }
    private void dfs(TreeNode root, StringBuilder sb, List<String> ans) {
        if (root == null) return;
        int length = sb.length();
        sb.append(root.val);
        if (root.left == null && root.right == null) ans.add(sb.toString());
        else {
            sb.append("->");
            dfs(root.left, sb, ans);
            dfs(root.right, sb, ans);
        }
        sb.setLength(length);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
