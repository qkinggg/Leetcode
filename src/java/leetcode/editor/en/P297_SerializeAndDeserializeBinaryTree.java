package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P297_SerializeAndDeserializeBinaryTree {
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
        if (root == null) {
            sb.append((char) 65535);
            return;
        }
        sb.append((char) (root.val+1001));
        serializeHelper(root.left, sb);
        serializeHelper(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<Character> ss = new ArrayDeque<>();
        for (char ch : data.toCharArray()) {
            ss.add(ch);
        }
        return deserializeHelper(ss);
    }
    private TreeNode deserializeHelper(Queue<Character> ss) {
        Character ch = ss.poll();
        if (ch == 65535) return null;
        TreeNode root = new TreeNode((int) ch - 1001);
        root.left = deserializeHelper(ss);
        root.right = deserializeHelper(ss);
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)
}
