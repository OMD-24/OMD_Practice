package LeetCode;

import java.util.Queue;
import java.util.Stack;

public class q_155 {
    class MinStack {

        Stack<Integer>  s1 ;
        Stack<Integer>  s2 ;

        public MinStack() {
            s1 = new Stack();
            s2 = new Stack();
        }

        public void push(int val) {
            s1.push(val);
            if (s2.isEmpty() || val <= s2.peek()) {
                s2.push(val);
            }
        }

        public void pop() {
            if (s1.peek().equals(s2.peek())) {
                s2.pop();
            }
            s1.pop();
        }

        public int top() {
            return s1.peek();
        }

        public int getMin() {
            return s2.peek();
        }


//        public void add(int n){
//            if(s2.empty() || s2.peek()>=n){
//                s2.push(n);
//                return;
//            }
//
//            int top = s2.pop();
//            add(n);
//            s2.push(top);
//        }

    }
}
