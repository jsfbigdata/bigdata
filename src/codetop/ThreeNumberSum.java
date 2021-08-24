package codetop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();
        int len = nums.length;
        //length小于3直接
        if(nums == null || len < 3) return ans;
        Arrays.sort(nums); // （1）先排序排序
        for (int i = 0; i < len ; i++) {
            if(nums[i] > 0) break; // 如果当前数字大于0，则三数之和一定大于0，所以结束循环
            //（2）去重判断
            if(i > 0 && nums[i] == nums[i-1]) continue; // 去重
            int L = i+1;
            int R = len-1;
            while(L < R){
                int sum = nums[i] + nums[L] + nums[R];
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    //左边有重读
                    while (L<R && nums[L] == nums[L+1]) L++; // 去重
                    //右边有重复
                    while (L<R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return ans;
    }

}
