package Contest197;

import java.util.ArrayList;
import java.util.Scanner;

public class q4 {

    public static int getOdd(int []B, int idx){
        for(int i=idx; i<B.length ; i++){

            int prefix= list.get(i-1) + B[i];
            if (B[i] % 2 != 0 && (prefix % 2 != 0)){

                return i;
            }
        }
        return -1;
    }

    public static int getEven(int []B,  int idx){
        for(int i=idx; i<B.length ; i++){
            int prefix= list.get(i-1) + B[i];
            if( B[i] % 2 == 0  && (prefix % 2 != 0)){

                return i;
            }
        }
        return -1;
    }

    public static boolean chh(int []B){



        for(int i=0; i<B.length; i=i+2){
            if(B[i] % 2 ==0){
                int index = getOdd(B,i);
                if(index != -1 ) {
                    int temp = B[index];
                    B[index] = B[i];
                    B[i] = temp;
                }
                else return false;
            }
            int prefix= list.get(i-1) + B[i];
            list.add(prefix);

        }


        for(int i=1; i<B.length; i=i+2){
            if(B[i] % 2 !=0){
                int index = getEven(B,i);
                if(index != -1) {
                    int temp = B[index];
                    B[index] = B[i];
                    B[i] = temp;
                }
                else return false;
            }
            int prefix= list.get(i-1) + B[i];
            list.add(prefix);
        }
        return true;

    }
 public void check (int[] B, ArrayList<Integer> list){




     for(int i=1; i< B.length; i++){
         int prefix= list.get(i-1) + B[i];
     }
 }


 static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int t=0; t<T ; t++) {
            int n = sc.nextInt();
            int B[] = new int[n];

            for(int i=0; i<n; i++){
                B[i] = sc.nextInt();
            }

            if(chh(B)){
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}
