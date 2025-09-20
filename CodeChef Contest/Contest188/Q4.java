package Contest188;

import java.util.Scanner;

public class Q4 {

    public static boolean sum(int[] A, int g, int end, int currentSum, boolean taken) {

        if (g > end) {
            return taken && currentSum % 3 == 0;
        }





        if (sum(A, g + 1, end, currentSum + A[g], true)) return true;


        if (sum(A, g + 1, end, currentSum, taken)) return true;


        return false;
    }



    public static boolean check(int[] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (sum(A, i, j, 0, false)) {
                    return true;
                }
            }
        }


        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0; k<t; k++){

            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }



            if(check(A)){
                System.out.println("yes");
            }
            else
                System.out.println("no");

        }


    }
}
