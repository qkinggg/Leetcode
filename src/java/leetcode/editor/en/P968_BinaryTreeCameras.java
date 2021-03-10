package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P968_BinaryTreeCameras {
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
enum State {
    COVERED, CAMERA, UNCOVERED
}
class Solution {
    private int ans;
    public int minCameraCover(TreeNode root) {
        if (dfs(root) == State.UNCOVERED) ans += 1;
        return ans;
    }
    private State dfs(TreeNode root) {
        if (root == null) return State.COVERED;
        State L = dfs(root.left);
        State R = dfs(root.right);
        if (L == State.UNCOVERED || R == State.UNCOVERED) { ans += 1; return State.CAMERA; }
        if (L == State.CAMERA || R == State.CAMERA) return State.COVERED;
        return State.UNCOVERED;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
