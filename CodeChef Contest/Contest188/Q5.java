package Contest188;

import java.util.Scanner;

public class Q5 {






    public static int Killing(int [] A){
        int n = A.length;
        int maxElement = 0;
        int x =0;

        for (int i=0; i<n; i++){
            if(A[i]<n){
                maxElement = Math.max(maxElement,A[i]);
                x++;
            }
        }

        if(n<=maxElement){
            return n;
        }



        return Math.min((maxElement +(n-x)), n);
    }



    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0; k<t; k++){

            int n = sc.nextInt();
            int A[] = new int[n];

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            System.out.println(Killing(A));


        }
    }
}
