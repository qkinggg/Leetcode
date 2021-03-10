package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P429_NAryTreeLevelOrderTraversal {
//leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(root, 0, ans);
        return ans;
    }
    private void helper(Node root, int level, List<List<Integer>> ans) {
        if (root == null) return;
        if (level == ans.size()) ans.add(new ArrayList<>());
        ans.get(level).add(root.val);
        for (Node child : root.children) {
            helper(child, level+1, ans);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
