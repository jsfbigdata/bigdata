package codetop;
import java.util.*;
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            //第一步：初始化
           List<Integer> temp = new LinkedList<>();
            backtrack(0, nums, res, new ArrayList<Integer>());
            return res;

        }

    private void backtrack(int i, int[] nums, List<List<Integer>> res, ArrayList<Integer> tmp) {
        //注意子集是不用的
            res.add(new ArrayList<>(tmp));
            //初始化都是从给定的start开始
            for (int j = i; j < nums.length; j++) {
                //
                tmp.add(nums[j]);
                backtrack(j + 1, nums, res, tmp);
                //回溯算法的唯一区别点
                tmp.remove(tmp.size() - 1);
            }
        }
    }

}
