package LeetCode;

import java.util.Scanner;

public class SingleNumber {


    public static int single(int [] A, int start, int end){

        if (start==end){
            return A[start];
        }

            if(start<end && A[start]==A[end]){

                 return single(A, start+1,end-1);
            }
            else
                return single(A,start+1,end);


        }



    public static void main (String [] args){
        int Arr[] = new int[7];
        Scanner sc= new Scanner(System.in);
        for (int i=0; i<Arr.length; i++){
            Arr[i]=sc.nextInt();
        }
        int end = Arr.length-1;
        int start = 0;
        System.out.println(single(Arr,0,Arr.length-1));
    }
}
