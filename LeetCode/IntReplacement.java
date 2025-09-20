package LeetCode;

import java.util.Scanner;

public class IntReplacement {
    public static int integerReplacement(int n, int count){

        if(n==1){
            return count;
        }

        if(n%2==0){
            n=n>>1;
            return integerReplacement(n,count+1);
        }

        else {
            int plus =integerReplacement(n+1,count);
            int minus =integerReplacement(n-1,count);
            return Math.min(plus,minus) ;
        }



    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        System.out.println(integerReplacement(n,count));
    }
}
