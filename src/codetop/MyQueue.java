package codetop;

import java.util.LinkedList;
import java.util.Stack;

public class MyQueue {
    /** Initialize your data structure here. */
    Stack<Integer> input = new Stack<Integer>();
    Stack<Integer> output = new Stack<Integer>();
    public MyQueue() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(output.isEmpty()){
            in2out();
        }
       return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(output.isEmpty()){
            in2out();
        }
        return output.peek();

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(output.isEmpty()){
            in2out();
        }
        return  output.isEmpty();
    }
    public void in2out(){
        if(!input.isEmpty()){
            output.push(input.pop());
        }
    }

}
