package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum3 {
    public static List<List<Integer>> threeSum(int []A){

        List<List<Integer>> mainList = new ArrayList<>();

        Arrays.sort(A);

        for(int i=0; i<A.length-2; i++){

            if (i > 0 && A[i] == A[i - 1]) continue;

            int l = i+1;
            int r = A.length-1;
            while(l<r){
                int sum = A[i]+ A[l]+ A[r];

                if(sum == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(A[i]);
                    list.add(A[l]);
                    list.add(A[r]);
                    mainList.add(list);
                    while (l < r && A[l] == A[l + 1]) l++;
                    while (l < r && A[r] == A[r - 1]) r--;

                    l++;
                    r--;
                }

                if (sum<0){
                    l++;
                }
                if (sum>0){
                    r--;
                }
            }
        }
        return mainList;


    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A[] = {-4,-1,-1,0,1,2};
        System.out.println(threeSum(A));
    }
}
