package Contest208;

import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int n = sc.nextInt();
            if(n%2 == 0){
                System.out.println(n/2);
            }
            else System.out.println(n/2+1);

        }
    }
}
