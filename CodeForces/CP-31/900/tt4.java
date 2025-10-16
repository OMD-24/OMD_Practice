import java.util.*;

public class tt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            int max1 = Integer.MIN_VALUE;
            int max2 = Integer.MIN_VALUE;
            for (int x : A) {
                if (x > max1) {
                    max2 = max1;
                    max1 = x;
                } else if (x > max2 && x != max1) {
                    max2 = x;
                }
            }





        }
    }
}
