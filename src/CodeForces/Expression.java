package CodeForces;

import java.util.Scanner;

public class Expression {

    public static int result(int a, int b, int c){
        int A[] = new int[6];
        A[0] = a+(b*c);
        A[1] = a*(b+c);
        A[2] = a*b*c;
        A[3] = (a+b)*c;
        A[4] = (a*b)+c;
        A[5] = a+b+c;

        int max = Integer.MIN_VALUE;
        for (int i=0; i< A.length; i++){
            max = Math.max(max,A[i]);
        }

        return max;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(result(a,b,c));
    }
}
