package codetop;

public class ExchangeNums {
    public int[] exchange(int[] nums){
        //z注意new了一个新的int数组
        int[] result = new int[nums.length];
        int left = 0,right = nums.length-1;
        for(int i = 0; i<nums.length;i++) {
            //判断nums[i]是否为奇偶数
            //奇数放在前面，偶数放在后面
            //双指针实现
            if(nums[i]%2==1) {
                result[left] = nums[i];
                left++;
            }else {
                result[right] = nums[i];
                right--;
            }
        }
        return result;

    }
}
