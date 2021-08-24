package codetop;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public MinStack() {
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        //注意这里的初始化
        minStack.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(), x));
    }

    public void pop() {
        xStack.pop();
        minStack.pop();
    }
//这里是
    public int top() {
        return xStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

}
