package CodeForces;

import java.util.Scanner;

public class FalseeAlarm {

    public static String check(int[] A, int x) {
        boolean used = false;
        int timer = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                // Door is open, proceed normally
                if (timer > 0) timer--; // Decrease timer if button is active
            } else {
                // Door is closed
                if (!used) {
                    // Use the button for the first time
                    used = true;
                    timer = x - 1; // First second used now
                } else {
                    // Button already used
                    if (timer > 0) {
                        timer--; // Still within active time
                    } else {
                        return "NO"; // Cannot pass this closed door
                    }
                }
            }
        }

        return "YES";
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();

        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            System.out.println(check(A,x));
        }
    }
}
