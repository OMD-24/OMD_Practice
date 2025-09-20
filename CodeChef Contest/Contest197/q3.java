package Contest197;

import java.util.Scanner;

public class q3 {



    public static void check(int[] B){

      int odd =0;
      int even =0;

        for(int i=0; i< B.length; i++){
            if(B[i] % 2 != 0){
                odd++;
            }
            else even ++;
        }

       if(odd % 2 != 0 && ( (even == odd) || (even == odd-1) || (even == odd+1))){
           System.out.println("Yes");
       }
       else System.out.println("No");


    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T ; t++) {
            int n = sc.nextInt();
            int B[] = new int[n];

            for(int i=0; i<n; i++){
                B[i] = sc.nextInt();
            }

           check(B);
        }
    }
}
