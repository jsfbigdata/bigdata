package codetop;

import java.util.HashMap;
import java.util.Map;

public class MajorElement {
    private int countNums(int[] nums) {
        HashMap<Integer, Integer> tempMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (tempMap.containsKey(nums[i])) {
                tempMap.put(nums[i], tempMap.get(nums[i]) + 1);
            } else {
                tempMap.put(nums[i], 1);
            }
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
            if (entry.getValue() > maxEntry.getValue()) {
                //entry对应的key最大,因此要维护一个map entry
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }
}

//    private Map<Integer,Integer> getMajorElement(){
//
//    }
//        private Map<Integer, Integer> countNums(int[] nums) {
//            Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
//            for (int num : nums) {
//                if (!counts.containsKey(num)) {
//                    counts.put(num, 1);
//                } else {
//                    counts.put(num, counts.get(num) + 1);
//                }
//            }
//            return counts;
//        }
//        public int majorityElement(int[] nums) {
//            Map<Integer, Integer> counts = countNums(nums);
//            Map.Entry<Integer, Integer> majorityEntry = null;
//            for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
//                if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
//                    majorityEntry = entry;
//                }
//            }
//
//            return majorityEntry.getKey();
//        }



