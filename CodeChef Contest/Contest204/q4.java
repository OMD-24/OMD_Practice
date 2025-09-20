package Contest204;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {

            int n = sc.nextInt();
            int m = sc.nextInt();

            int A[] = new int[n];

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i=0; i<n; i++){
                sum += (A[i] + 1) % m;

            }

            if(sum<=m) {
                System.out.println(sum);
            }

            else System.out.println(0);

        }
    }
}