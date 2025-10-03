package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class q_225 {

    class MyStack {

        Queue<Integer> q ;
        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.add(x);
            int size = q.size();
            while(size>0){
                q.add(q.remove());
                size--;
            }
        }

        public int pop() {
            return q.remove();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }


    }
}