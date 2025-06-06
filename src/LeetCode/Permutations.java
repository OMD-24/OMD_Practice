package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutations {



    public static void link(int[] A, List<List<Integer>> list, List<Integer> B, boolean[] used) {
        if (B.size() == A.length) {
            list.add(new ArrayList<>(B));
            return;
        }

        for (int i = 0; i < A.length; i++) {
            if (used[i]) continue;

            B.add(A[i]);
            used[i] = true;

            link(A, list, B, used);

            // Backtrack
            B.remove(B.size() - 1);
            used[i] = false;
        }
    }





    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A[] = {1,2,3,4};
        int target = 1;
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        boolean[] used = new boolean[A.length];
        link(A,list,B,used);
        System.out.println(list);

    }
}
