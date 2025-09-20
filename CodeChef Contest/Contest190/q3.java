package Contest190;

import java.util.Scanner;

public class q3 {

    public static int  binarysearch(int A[], int key){

        for(int i=0; i< A.length; i++){
            if(A[i]==key){
                return i;
            }
        }
        return -1;

    }

//    public static int Gmin(int A[], boolean[]B){
//
//        int Gmin = Integer.MIN_VALUE;
//
//    }

    public static int ope(int[] A, boolean []B){

        int score = 0;

        for(int i=0; i<A.length-1; i++){
            if (B[i]==false && B[i+1]==false){
                int Gmin = Integer.MIN_VALUE;

                int min = Math.min(A[i],A[i+1]);
                int max = Math.max(A[i],A[i+1]);

                if (min>=Gmin){
                    Gmin = min;

                    int idx = binarysearch(A,max);

                    if(idx==i){
                        B[i]=true;
                    }

                    if(idx==i+1){
                        B[i+1]=true;
                    }

                }
                score += Gmin;


            }
        }

        return score;
    }

    public static void call(int idx, int val, int []A){

        boolean B[] = new boolean[A.length];
        A[idx] = val;
        System.out.println(ope(A,B));
    }


    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0 ; t<T; t++){
            int n = sc.nextInt();
            int q = sc.nextInt();

            int A[] = new int[n];

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            int update[] = new int [2*q];
            for(int i=0; i<2*q; i++){
                update[i] = sc.nextInt();
            }

            for(int i=0; i<2*q; i=i+2){
                call(update[i],update[i+1],A);
            }


        }

    }
}
