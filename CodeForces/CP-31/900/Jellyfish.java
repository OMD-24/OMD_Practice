import java.util.*;

public class Jellyfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int A[] = new int [n];

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            int sec = 0;
            for(int i=0; i<n; i++){
                sec += Math.min(A[i], a - 1);
            }

            System.out.println(b + sec );

        }
    }
}
