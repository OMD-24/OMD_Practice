package Contest197;

import java.util.Scanner;

public class q2 {


    public static int Check(int[] B, int x, int y){

        int balls = 0;

        for(int i=0; i<B.length; i++){
            int p = B[i];

            if(p>=x && p<=y){
                balls++;
            }
        }
        return balls;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T ; t++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int B[] = new int[n];

            for(int i=0; i<n; i++){
                B[i] = sc.nextInt();
            }

            System.out.println(Check(B,x,y));
        }
    }
}
