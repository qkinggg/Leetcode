package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P987_VerticalOrderTraversalOfABinaryTree {
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
    private Map<Integer, Map<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root, 0, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for (Map<Integer, PriorityQueue<Integer>> m : map.values()) {
            List<Integer> list = new ArrayList<>();
            for (PriorityQueue<Integer> pq : m.values()) {
                while (!pq.isEmpty()) list.add(pq.poll());
            }
            ans.add(list);
        }
        return ans;
    }
    private void dfs(TreeNode root, int x, int y) {
        if (root == null) return;
        map.putIfAbsent(x, new TreeMap<>());
        map.get(x).putIfAbsent(y, new PriorityQueue<>());
        map.get(x).get(y).offer(root.val);
        dfs(root.left, x-1, y+1);
        dfs(root.right, x+1, y+1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
