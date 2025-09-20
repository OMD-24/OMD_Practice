package Contest190;

import java.util.Scanner;
import java.util.*;

public class q5 {

    public static int  getIdx(List<Integer> A){

        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i=0; i< A.size(); i++){
            if(A.get(i)>max){
                max = A.get(i);
                index =i;

            }
        }
        return index;

    }

//    public static int Gmin(int A[], boolean[]B){
//
//        int Gmin = Integer.MIN_VALUE;
//
//    }

    public static int ope(int[] A) {
        // Copy the array so that original A is not modified
        LinkedList<Integer> list = new LinkedList<>();
        for (int value : A) list.add(value);

        int score = 0;

       while (list.size()>1){
           int Gmin = Integer.MIN_VALUE;
           ArrayList<Integer> min = new ArrayList<>();
           ArrayList<Integer> max = new ArrayList<>();

           for(int i=0; i< list.size()-1; i++){
               int a = list.get(i);
               int b = list.get(i+1);
               min.add(Math.min(a,b));
               max.add(Math.max(a,b));
           }
           int idx = getIdx(min);
           score += min.get(idx);
           max.remove(idx);
           min.clear();
           max.clear();

       }

        return score;
    }
            public static void call(int idx, int val, int[] A) {
                A[idx] = val;
                System.out.println(ope(A));
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

            for (int i = 0; i < q; i++) {
                int idx = sc.nextInt() - 1;
                int val = sc.nextInt();
                call(idx, val, A);
            }


        }

    }
}
