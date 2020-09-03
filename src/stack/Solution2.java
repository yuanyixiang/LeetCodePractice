package stack;

import java.util.Stack;

/**
 * @author rd-yyx
 * @version 1.0
 * @date 2020/8/25 5:41 下午
 */
public class Solution2 {
    //tile :https://leetcode-cn.com/problems/min-stack/
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    public void MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {

        stack.push(x);
        if(minStack.isEmpty() || x <= minStack.peek()){
            minStack.push(x);
        }
    }

    public void pop() {
        if(stack.pop().equals(minStack.peek())){
            minStack.pop();
        }
    }

    public int top() {

        return stack.peek();
    }

    public int getMin() {
        if(minStack.isEmpty()){
            return 0;
        }
        return minStack.peek();
    }
}
