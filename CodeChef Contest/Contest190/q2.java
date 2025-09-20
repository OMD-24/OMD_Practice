package Contest190;

import java.util.Scanner;

public class q2 {

    public static int check(int n){
        if(n==1){
            return 1;
        }
        else if(n==3){
            return 3;
        }
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        if(n%2==0){
             a = check(n/2);
        }

        if(n>3){
             b = check(n-3);
        }


        return Math.min(a,b);
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0 ; t<T; t++){
            int n = sc.nextInt();
            System.out.println( check(n));
        }
    }
}
