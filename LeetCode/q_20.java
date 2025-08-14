
import java.util.Stack;

public class q_20 {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();

        for(int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }

            else {
             if(st.isEmpty()){
                    return false;
                }

                if((st.peek() == '(' && ch == ')') ||
                (st.peek() == '{' && ch == '}') ||
                (st.peek() == '[' && ch == ']')
                ){
                    st.pop();
                }

                else return false;
        }


     
    }
    if (st.empty()) return true;
    else return false;
}


public static void main(String[] args) {
    String s = "[{()}]";
    q_20 a = new q_20();
    System.out.println(a.isValid(s));
}
}