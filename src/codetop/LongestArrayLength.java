package codetop;

public class LongestArrayLength {
    public int getLength(int[] A,int[] B){
        int n = A.length;
        int m = B.length;
        int max = 0;
        int[][] dp = new int[n + 1][m + 1];

        for (int i=1;i<=n;i++) {

            for (int j=1;j<=m;j++) {
                //判断的条件为dp的核心

                if (A[i - 1] == B[j - 1]) {
                    //重点是这一步
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = 0;
                }
                //max和dp取最大值
                max = Math.max(max, dp[i][j]);
            }
        }
        return max;
    }

}
