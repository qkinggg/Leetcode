package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P501_FindModeInBinarySearchTree {
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
    private int count, maxFreq;
    private Integer prev;
    public int[] findMode(TreeNode root) {
        List<Integer> mode = new ArrayList<>();
        dfs(root, mode);
        int[] ans = new int[mode.size()];
        for (int i = 0; i < mode.size(); i++) ans[i] = mode.get(i);
        return ans;
    }

    private void dfs(TreeNode root, List<Integer> mode) {
        if (root == null) return;
        dfs(root.left, mode);
        count = (prev != null && root.val == prev) ? count+1 : 1;
        prev = root.val;
        if (count > maxFreq) {
            maxFreq = count;
            mode.clear();
        }
        if (count == maxFreq) mode.add(prev);
        dfs(root.right, mode);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
