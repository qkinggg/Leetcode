package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P113_PathSumII {
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path, ans);
        return ans;
    }
    private void dfs(TreeNode root, int shift, List<Integer> path, List<List<Integer>> ans) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && shift == root.val) ans.add((new ArrayList<>(path)));
        dfs(root.left, shift- root.val, path, ans);
        dfs(root.right, shift- root.val, path, ans);
        path.remove(path.size()-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
