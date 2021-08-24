package codetop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public String reverseWord(String s){
       s = s.trim();
       String[] mm = s.split("\\s+");
       List<String> tempList =  Arrays.asList(mm);
       Collections.reverse(tempList);
       //注意这里是用string本身的方法做切割实现的
       return String.join(" ",tempList);
    }
}
