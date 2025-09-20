package LeetCode;

import java.util.Scanner;

public class powerOfTwo {
    public static boolean isPowerOfTwo(int n){
        int count = 0;
        while(n!=0){
            if((n&1) == 1){
                count++;
            }
            n=n>>1;
        }

        if(count ==1 ){
            return true;
        }
        return false;
    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println(isPowerOfTwo(r));
    }
}
