package codetop;

import java.util.Deque;
import java.util.LinkedList;

public class CQueue {
    Deque<Integer> stack1;
    Deque<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<Integer>();
        stack2 = new LinkedList<Integer>();
    }

    public void appendTail(int value) {
        //尾部o加入
        stack1.push(value);
    }

    public int deleteHead() {
        // 如果第二个栈为空，第一个不为空，则全部塞进去
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        //
        if (stack2.isEmpty()) {
            return -1;
        } else {
            int deleteItem = stack2.pop();
            return deleteItem;
        }
    }
}
