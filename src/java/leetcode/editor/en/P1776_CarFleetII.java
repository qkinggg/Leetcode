package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1776_CarFleetII {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public double[] getCollisionTimes(int[][] cars) {
        BiFunction<Integer, Integer, Double> collisionTime = (i, j) -> (double) (cars[j][0] - cars[i][0]) / (cars[i][1] - cars[j][1]);
        Stack<Integer> stack = new Stack<>();
        double[] ans = new double[cars.length];
        for (int i = cars.length - 1; i >= 0; i--) {
            while (!stack.isEmpty()) {
                int top = stack.peek();
                if ((cars[i][1] <= cars[top][1])) stack.pop();
                else if (ans[top] != -1 && collisionTime.apply(i, top) >= ans[top]) stack.pop();
                else break;
            }
            ans[i] = (stack.isEmpty()) ? -1 : collisionTime.apply(i, stack.peek());
            stack.push(i);
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
