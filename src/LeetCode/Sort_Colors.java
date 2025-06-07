package LeetCode;

import java.util.Scanner;

public class Sort_Colors {
    public static void sort(int[] A){
       int zero = 0;
       int one = 0;
       int two = 0;

       for (int i=0; i< A.length; i++){
           int a = A[i];
           if(a==0){
               zero++;
           }
           if(a==1){
               one++;
           }
           if(a==2){
               two++;
           }
       }

       int index = 0;
       for(int j=0; j<zero; j++){
           A[index++]=0;
       }
       for(int j=0; j<one; j++){
           A[index++]=1;
       }
       for(int j=0; j< two; j++){
           A[index++]=2;
       }


    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A[] = {2,0,2,1,1,0};

        sort(A);
        for(int i=0; i<A.length ; i++){
            System.out.print(A[i]+" ");
        }
    }
}
