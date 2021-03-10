package kt.leetcode.editor.en;
import java.util.*;
import java.util.function.*;
import kt.leetcode.editor.en.definition.*;

public class P200_NumberOfIslands {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    fun numIslands(grid: Array<CharArray>): Int {
        /*  nested function begin */
        fun dfs(y: Int, x: Int) {
            if (y < 0 || y >= grid.size || x < 0 || x >= grid[0].size || grid[y][x] == '0') return
            grid[y][x] = '0'
            dfs(y-1, x)
            dfs(y+1, x)
            dfs(y, x-1)
            dfs(y, x+1)
        }
        /*  nested function end */
        var ans = 0
        for (i in grid.indices)
            for (j in grid[0].indices)
                if (grid[i][j] == '1') {
                    ans++
                    dfs(i, j)
                }
        return ans
    }
}
//leetcode submit region end(Prohibit modification and deletion)
}
