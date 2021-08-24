package codetop;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsValid {
    public static boolean isValid(String s ){
        Map<Character,Character> tempMap = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        tempMap.put('}','{');
        tempMap.put(')','(');
        tempMap.put(']','[');
        int sLength = s.length();
        for(int i=0;i<sLength;i++){
            Character currentChar = s.charAt(i);
            //主要先要判断containsKey
            if(tempMap.containsKey(currentChar)){
                //判断是否为空
                if (stack.isEmpty() || stack.peek() != stack.get(currentChar)) {
                    return false;
                }
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        return  stack.isEmpty();
    }
}
