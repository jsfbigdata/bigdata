package codetop;

import java.util.Arrays;

public class CoinChange {
    public int coinChange(int[] coins,int amount) {
        //（1）初始化dp
        int[]  dp = new int[coins.length+1];
        int max = amount+1;
        //（2）灌进去amout的值
        Arrays.fill(dp,max);
        //
        dp[0]=0;
        //（3）遍历
        for(int i =0;i<amount;i++){
            for(int j = 0;j<coins.length;j++){
                //
                if(coins[j]<=i){
                    //（4）注意这里是i-coins
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }

    }
        //（5）注意这里的大于判断
        return dp[amount]>amount?-1:dp[amount];
//    public int coinChange(int[] coins,int amount){
//        int max = amount + 1;
//        //dp生成11个
//        int[] dp = new int[amount + 1];
//
//        //值都为amout
//        //dp达到目标对应的硬币数
//        Arrays.fill(dp, max);
//        dp[0] = 0;
//        for (int i = 1; i <= amount; i++) {
//            for (int j = 0; j < coins.length; j++) {
//                if (coins[j] <= i) {
//                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
//                }
//            }
//        }
//        return dp[amount] > amount ? -1 : dp[amount];
//    }

    }

}
