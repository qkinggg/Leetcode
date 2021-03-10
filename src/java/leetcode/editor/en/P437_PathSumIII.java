package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P437_PathSumIII {
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
    // https://www.youtube.com/watch?v=ofMqFAFVcKY&ab_channel=AlgorithmsMadeEasy
    private Map<Integer, Integer> map = new HashMap<Integer, Integer>(); // (prefix, count)
    private int ans;
    public int pathSum(TreeNode root, int sum) {
        map.put(0, 1);
        dfs(root, 0, sum);
        return ans;
    }
    private void dfs(TreeNode root, int prefix, int sum) {
        if (root == null) return;
        prefix += root.val;
        ans += map.getOrDefault(prefix-sum, 0);
        map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        dfs(root.left, prefix, sum);
        dfs(root.right, prefix, sum);
        map.put(prefix, map.get(prefix) - 1);
    }
    /* O(H^2) method
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSum(root.left, sum) + pathSum(root.right, sum) + includeRoot(root, sum);
    }
    private int includeRoot(TreeNode root, int shift) {
        if (root == null) return 0;
        return includeRoot(root.left, shift-root.val) + includeRoot(root.right, shift-root.val) + ((root.val == shift) ? 1 : 0);
    }*/
}
//leetcode submit region end(Prohibit modification and deletion)
}
