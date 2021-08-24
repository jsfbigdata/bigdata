package codetop;

import java.util.HashSet;
import java.util.Set;

public class LongenstConsecutive {
    //峰值
    public int longenstConsecutive(int[] nums){
        //填入到hashset中
    Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
        num_set.add(num);
    }

    int longestStreak = 0;
    //开始遍历
        for (int num : num_set) {

            //先把i-1的这种情况排除掉
        if (!num_set.contains(num - 1)) {
            int currentNum = num;
            int currentStreak = 1;


            //往右找比他大的数
            while (num_set.contains(currentNum + 1)) {
                currentNum += 1;
                currentStreak += 1;
            }

            longestStreak = Math.max(longestStreak, currentStreak);
        }
    }

        return longestStreak;

}



}
