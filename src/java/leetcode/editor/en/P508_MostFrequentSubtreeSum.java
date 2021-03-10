package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P508_MostFrequentSubtreeSum {
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
    private Map<Integer, Integer> counts = new HashMap<>(); // (sum, freq)
    private int maxFreq;
    public int[] findFrequentTreeSum(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeSum(root, list);
        int[] ans = new int[list.size()];
        int idx = 0;
        for(int x : list) ans[idx++] = x;
        return ans;
    }
    private int TreeSum(TreeNode root, List<Integer> list) {
        if (root == null) return 0;
        int sum = TreeSum(root.left, list) + TreeSum(root.right, list) + root.val;
        int freq = counts.getOrDefault(sum, 0) + 1;
        counts.put(sum, freq);
        if (freq > maxFreq) { maxFreq = freq; list.clear(); }
        if (freq == maxFreq) list.add(sum);
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
