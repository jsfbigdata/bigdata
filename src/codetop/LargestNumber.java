package codetop;

import java.util.Arrays;

public class LargestNumber {
        public String largestNumber(int[] nums) {
            int n = nums.length;
            String[] ss = new String[n];
            for (int i = 0; i < n; i++) ss[i] = "" + nums[i];
            Arrays.sort(ss, (a, b) -> {
                String sa = a + b, sb = b + a ;
                //比较两个之间哪个更大
                return sb.compareTo(sa);
            });

            StringBuilder sb = new StringBuilder();
            for (String s : ss) sb.append(s);
            int len = sb.length();
            //遇到0则加一
            int k = 0;
            while (k < len - 1 && sb.charAt(k) == '0') k++;
            return sb.substring(k);
        }
    }

