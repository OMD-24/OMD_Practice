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
            if(!s1.empty()){

            }

        }

        public void pop() {
            s1.pop();
        }

        public int top() {
            return s1.peek();
        }

        public int getMin() {
            return min;
        }

        public void add(){
            if(s1.empty()){
                return;
            }
            int top1 = s1.pop();
            int top2 = s1.pop();
            add();
            s2.
        }
    }
}
