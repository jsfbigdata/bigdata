package codetop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);

        backtrack(candidates, target, new ArrayList<>(), 0);

        return res;
    }

    private void backtrack(int[] candidates, int remains, List<Integer> path, int start){
        //remain变成0的时候
        if(remains == 0){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i = start; i < candidates.length; i++){
            if(candidates[i] > remains)
                return;
            //注意重复的话就直接往下遍历
            if(i > 0 && candidates[i] == candidates[i-1])   continue;
            //[2,2,3,5]

            path.add(candidates[i]);
            //迭代这个remains - candidates[i]
            backtrack(candidates, remains - candidates[i], path, i);

            path.remove(path.size() - 1);
        }
    }
    }

