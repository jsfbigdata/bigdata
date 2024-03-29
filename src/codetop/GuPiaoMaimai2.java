package codetop;

public class GuPiaoMaimai2 {
//        public int maxProfit(int[] prices){
//            int n = prices.length;
//            int[][] dp = new int[n][2];
//            dp[0][0] = 0;
//            dp[0][1] = -prices[0];
//            for (int i = 1; i < n; ++i) {
//                //0 - prices,1+prices
//                //dp[i-1][0] dp[i-1][1]
//                dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
//                dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
//            }
//            //记住最后返回的是[n-1][0]
//            return dp[n - 1][0];
//        }
    public int  maxProfiit(int[] prices){
        int[][] dp = new int[prices.length][2];
        int length = prices.length;
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for(int i=0;i<=prices.length;i++){
            //把等待的那一天的状态存到dp
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i])
        }
        return dp[length][0];
    }

    }

