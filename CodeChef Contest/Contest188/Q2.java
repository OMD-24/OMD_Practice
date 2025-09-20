package Contest188;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0; k<t; k++){

            int n = sc.nextInt();
            int A[] = new int[n];

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            int odd = 0;
            int even = 0;
            for(int i=0; i<n; i=i+2){
                even += A[i];
            }

            for(int i=1; i<n; i=i+2){
                odd += A[i];
            }

            System.out.println(Math.max(even,odd));

        }

    }
}