package codetop;

public class MinPathSum {
    public int minPathSum(int[][] grid){
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length, columns = grid[0].length;
        //初始化dp，dp为
        int[][] dp = new int[rows][columns];
        dp[0][0] = grid[0][0];
        //原来的状态+当前的状态
        for (int i = 1; i < rows; i++) {
            //
            dp[i][0] = dp[i - 1][0] + grid[i][0];
        }
        for (int j = 1; j < columns; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                //主要是前一个状态+当前的状态
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
            }
        }
        return dp[rows - 1][columns - 1];

    }
}
