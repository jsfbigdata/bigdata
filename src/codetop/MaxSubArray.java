package codetop;
public class MaxSubArray {
    public static int maxSubArray(int[] num){
        int result =  num[0];
        int tempValue = 0;
        for(int p:num){
            //原来的值做加和
            tempValue = Math.max(tempValue+p,p);
            result = Math.max(result,tempValue);
        }
        return result;
    }
}
