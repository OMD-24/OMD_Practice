

import java.util.Scanner;

public class iQ_test {

    public static int check(int []A) {

        int odd = 0;
        int even = 0;

        for (int i = 0; i < 3; i++) {
            if (A[i] % 2 == 0) {
                even++;
            } else odd++;
        }

        if (even > odd) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 != 0) {
                    return i+1;
                }
            }
        }

        else if (even < odd) {
            for (int i = 0; i < A.length; i++) {
                if (A[i] % 2 == 0) {
                    return i+1;
                }
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int [n];

        for (int i=0; i<n; i++){
            A[i] = sc.nextInt();
        }

        System.out.println(check(A));
    }
}
