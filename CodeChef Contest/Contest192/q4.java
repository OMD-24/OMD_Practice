package Contest192;
import java.util.*;

public class q4 {

    public static int check(int[] A, int i, int cnt) {
        if (i < 0 || i >= A.length) {
            return Integer.MAX_VALUE;
        }

        if (i + 1 != A.length && A[i] < A[i + 1]) {
            return cnt + A[i];
        }

        return check(A, i + 1, cnt + 1);
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


            System.out.println(check(A,0,0));

        }

    }
}
