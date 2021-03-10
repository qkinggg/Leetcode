package java.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import java.leetcode.editor.en.definition.*;

public class P1773_CountItemsMatchingARule {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int key = 0, ans = 0;
        if (ruleKey.equals("color")) key = 1;
        else if (ruleKey.equals("name")) key = 2;
        for (List<String> item : items) {
            if (item.get(key).equals(ruleValue)) ans++;
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
