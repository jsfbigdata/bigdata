package codetop;

public class LengthOfList {
    public int getLengthOfList(int[] nums){
        if(nums.length==0){
            return 0;
        }
        int[] dp = new int[nums.length];
        dp[0]=1;
        int result = 0;
        for(int i=0;i<nums.length;i++){
            dp[i] = 1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
            }
            result = Math.max(result,dp[i]);
        }
        return result;
    }
}

