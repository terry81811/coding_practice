package leetcode_08_2016;

import java.util.LinkedList;
import java.util.Stack;

public class E_232_ImplementQueueusingStacks {
    // Push element x to the back of queue.
	Stack<Integer> st = new Stack<Integer>();
	
    public void push(int x) {
        Stack<Integer> tmp = new Stack<Integer>();
        
        while(!st.isEmpty()) {
            tmp.push(st.pop());        	
        }
        st.push(x);
        while(!tmp.isEmpty()) {
        	st.push(tmp.pop());
        }
        
    }

    // Removes the element from in front of queue.
    public void pop() {
        st.pop();
    }

    // Get the front element.
    public int peek() {
        return st.peek();
    }

    // Return whether the queue is empty.
    public boolean empty() {
    	return st.isEmpty();
    }
}
