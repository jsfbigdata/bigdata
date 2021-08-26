package codetop;

import java.util.List;

public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int deep = triangle.size();
        int[][] dp = new int[deep][deep];
        for (int i = 0; i < deep; i++) {
            dp[deep - 1][i] = triangle.get(deep - 1).get(i);
        }
        for (int i = deep - 2; i >= 0; i--) {
            for (int j = 0; j < deep - 1; j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
            deep--;
        }
        return dp[0][0];
    }
}
