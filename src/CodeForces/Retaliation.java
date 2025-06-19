package CodeForces;

import java.util.Scanner;

public class Retaliation {
    public static boolean search(int []A){


        int cnt = 0;
        int start = 0;
        int end = A.length-1;

        while (start <= end){
            boolean s = A[start] % (start+1) ==0 || A[start] % (A.length-start) == 0;
            boolean e = A[end] % (end+1) ==0 || A[end] % (A.length-end) == 0;
            if (s&&e){
                start++;
                end--;
            }
           else if (s){
               start++;
            } else if (e) {
                end--;
            }
           else return false;
        }

        return true;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int A[] = new int[n];

            for (int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            if(search(A)){
                System.out.println("YES");
            }
            else System.out.println("NO");

        }
    }
}
