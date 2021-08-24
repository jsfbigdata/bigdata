package codetop;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twosum(int[] input,int target){
        Map<Integer,Integer> tempMap = new HashMap<>();
        for(int i=0;i<input.length;i++){
            if(tempMap.containsKey(target-input[i])){
               return  new int[]{i,tempMap.get(target-input[i])};
            }
            tempMap.put(input[i],i);
        }
       return  null;
    }
}
