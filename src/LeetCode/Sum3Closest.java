package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sum3Closest {
    public static int threeSum(int []A, int target){

        List<List<Integer>> mainList = new ArrayList<>();

        Arrays.sort(A);
        int closest = Integer.MAX_VALUE;

        for(int i=0; i<A.length-2; i++){

            if (i > 0 && A[i] == A[i - 1]) continue;

            int l = i+1;
            int r = A.length-1;
            while(l<r){
                int sum = A[i]+ A[l]+ A[r];
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }
                if (sum < target) {
                    l++;  // Need a bigger sum
                } else if (sum > target) {
                    r--;  // Need a smaller sum
                } else {
                    // Exact match found
                    return sum;
                }


            }
        }
        return closest;


    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A[] = {-1,2,1,-4};
        int target = 1;
        System.out.println(threeSum(A,target));
    }
}
