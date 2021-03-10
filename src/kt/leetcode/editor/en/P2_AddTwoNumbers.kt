package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P2_AddTwoNumbers {
//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(-1)
        var cur = dummy
        var n1 = l1
        var n2 = l2
        var carry = 0
        while (n1 != null || n2 != null || carry != 0) {
            val sum = n1.value() + n2.value() + carry
            cur.next = ListNode(sum%10)
            carry = sum/10
            cur = cur.next!!
            n1 = n1?.next
            n2 = n2?.next
        }
        return dummy.next
    }

    private fun ListNode?.value() = this?.`val` ?: 0
}
//leetcode submit region end(Prohibit modification and deletion)
}
