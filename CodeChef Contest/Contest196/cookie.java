package Contest196;
import java.util.*;
import java.util.Scanner;

public class cookie {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Found at index i
            }
        }
        return -1; // Not found
    }



    public static int findLeast(int[] A) {

        int least = A[0];

        for (int i = 1; i < A.length; i++) {
            if (A[i] < least) {
                least = A[i];
            }
        }

        return least;
    }



    public static void check(int[] A, int c, int min) {
        int cook = c;


        int result = result(A,c,cook,min);
        System.out.println(result);



    }

    public static int result(int[] A, int c, int cook, int min) {
        if (linearSearch(A, cook) == -1 && cook > min) {
            return cook - c;
        }
        return result(A, c, cook + 1, min);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t=0; t<T; t++){
            int n = sc.nextInt();
            int c = sc.nextInt();

            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            int min = findLeast(A);

            check(A,c,min);
        }

    }
}
