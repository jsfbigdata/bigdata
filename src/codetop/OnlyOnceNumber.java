package codetop;

import java.util.Arrays;

public class OnlyOnceNumber {
    public int singleNumber(int[] nums){
        if(nums.length==0){
            return  -1;
        }
        if(nums.length==1){
            return nums[0];
        }
        //记住要做排序
        Arrays.sort(nums);
        //
        for(int i = 0;i<nums.length;i+=2){
            //一次跳两个
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }

    }
}
