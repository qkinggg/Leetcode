package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;
import java.lang.Exception

public class P468_ValidateIPAddress {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun validIPAddress(IP: String): String {
        return when {
            IP.count { it == '.' } == 3 -> {
                val regex = """0|[1-9]\d{0,2}""".toRegex()
                when {
                    IP.split('.')
                        .all { it.matches(regex) && it.toInt() <= 255 } -> "IPv4"
                    else -> "Neither"
                }
            }

            IP.count { it == ':' } == 7 -> {
                val regex = """[a-fA-F\d]{1,4}""".toRegex()
                when {
                    IP.split(':')
                        .all { it.matches(regex) } -> "IPv6"
                    else -> "Neither"
                }
            }

            else -> "Neither"
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
