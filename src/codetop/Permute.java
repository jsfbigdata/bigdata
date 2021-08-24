package codetop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Permute {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result =new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int end = nums.length;
        for(int num:nums){
            output.add(num);
        }
        backtrack(end,output,result,0);
        return result;
    }
    public void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first) {
        // 所有数都填完了
        if (first == n) {
            res.add(new ArrayList<Integer>(output));
        }
        //int i开始自增
        for (int i = first; i < n; i++) {
            // 动态维护数组
            Collections.swap(output, first, i);
            // 继续递归填下一个数,开始的数据自增
            backtrack(n, output, res, first + 1);
            // 撤销操作
            Collections.swap(output, first, i);
        }
    }
}
