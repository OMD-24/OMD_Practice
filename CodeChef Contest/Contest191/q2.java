package Contest191;

import java.util.*;

public class q2 {

    public static void check(int n){
        double a = Math.sqrt(n);
        int s = (int) (a);
        System.out.println(s*s);
    }



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            check(n);

        }
    }
}
