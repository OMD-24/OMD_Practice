package LeetCode;

import java.util.Stack;

public class q_735 {
    public int [] asteroidCollision(int[] asteroids) {


        Stack<Integer> s = new Stack<>();
        s.push(asteroids[0]);
        for(int i=1; i<asteroids.length; i++){

            boolean destroyed = false;

            while(!s.empty() && asteroids[i] <0 && s.peek() >0){
           if( Math.abs(asteroids[i])>Math.abs(s.peek())){
                s.pop();
               continue;
            }
           else if (Math.abs(asteroids[i]) == Math.abs(s.peek())){
               s.pop();
           }

                destroyed = true;
                break;
            }

            if (!destroyed) {
                s.push(asteroids[i]);
            }
        }
        int n = s.size();
        int A[] = new int[n];
        for(int i=n-1; i>=0; i--){
            A[i] = s.pop();
        }

        return A;
    }


    public static void main(String[] args) {
        int Arr[] = {5,10,-5};
        q_735 q = new q_735();
        System.out.println(q.asteroidCollision(Arr));

    }
}
