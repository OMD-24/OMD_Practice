package Contest193;
import java.util.*;

public class cr {

    public static String check(int a, int b){
        // Case 1: A = 0 is impossible (every number has at least divisor 1)
        if(a == 0){
            return "No";
        }

        // Case 2: B = 0 means N is odd (possible when A > 0)
        if(b == 0){
            return "Yes";
        }

        // Case 3: Both A > 0 and B > 0
        // For this to be possible, B must be divisible by A
        // Because B = k × A where k is the power of 2 in N's factorization
        if(b % a == 0){
            return "Yes";
        } else {
            return "No";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t = 0; t < T; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(check(a, b));
        }

        sc.close();
    }
}