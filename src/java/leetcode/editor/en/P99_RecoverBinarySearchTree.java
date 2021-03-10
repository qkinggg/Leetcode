package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P99_RecoverBinarySearchTree {
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
    private TreeNode prev;
    public void recoverTree(TreeNode root) {
        TreeNode prev = null;
        Deque<TreeNode> inverse = new ArrayDeque<>();
        dfs(root, inverse);
        inverse.getFirst().val = swap(inverse.getLast().val, inverse.getLast().val = inverse.getFirst().val);
    }
    private void dfs(TreeNode root, Deque<TreeNode> inverse) {
        if (root == null || inverse.size() == 4) return;
        dfs(root.left, inverse);
        if (prev != null && root.val < prev.val) {
            inverse.add(prev);
            inverse.add(root);
        }
        prev = root;
        dfs(root.right, inverse);
    }
    private <T> T swap(T second, T dontcare) {
        return second;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
