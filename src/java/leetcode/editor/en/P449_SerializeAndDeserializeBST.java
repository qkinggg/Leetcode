package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P449_SerializeAndDeserializeBST {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);
        return sb.toString();
    }
    private void serializeHelper(TreeNode root, StringBuilder sb) {
        if (root == null) return;
        sb.append((char) root.val);
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<Character> ss = new ArrayDeque<>();
        for (char ch : data.toCharArray()) {
            ss.add(ch);
        }
        return deserializeHelper(ss, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    private TreeNode deserializeHelper(Queue<Character> ss, int min, int max) {
        Character ch = ss.peek();
        if (ch == null || ch < min || ch > max) return null;
        TreeNode root = new TreeNode(ss.poll());
        root.left = deserializeHelper(ss, min, ch);
        root.right = deserializeHelper(ss, ch, max);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;
//leetcode submit region end(Prohibit modification and deletion)
}
