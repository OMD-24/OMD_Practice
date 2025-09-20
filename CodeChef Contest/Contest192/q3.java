package Contest192;
import java.util.*;

public class q3 {


    public static int count(int[]A){
        int one =0;
        int two =0;
        int x = Integer.MAX_VALUE;
        int y = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            if(A[i] == 1){
                one++;
            }

            else two++;
        }

        if(one == A.length || two == A.length){
            return 0;
        }



        else if (one % 2 ==0) {
            x= one/2;

        }

        else {
            y= two;
        }

        return Math.min(x,y);
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i]= sc.nextInt();
            }

            System.out.println(count(A));

        }

    }
}
