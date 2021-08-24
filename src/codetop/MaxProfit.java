package codetop;

public class MaxProfit {
    public  int maxProfit(int[] prices){
        int maxProfit = 0;
        int tempState = Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
           tempState =  Integer.min(tempState,prices[i]);
           maxProfit = Integer.max(maxProfit,prices[i]-tempState);
        }
        return maxProfit;
    }
}
