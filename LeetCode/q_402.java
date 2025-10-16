package LeetCode;

import java.util.Stack;

public class q_402 {

    public String removeKdigits(String num, int k) {


        Stack<String> s = new Stack<>();
        for(int i=1; i<num.length()-k; i++){
            StringBuilder sb = new StringBuilder(num);
                String str = sb.delete(i,i+k-1).toString();
                s.push(str);
        }
    }
}
