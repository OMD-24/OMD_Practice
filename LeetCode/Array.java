package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Array {

    public static int n = 5;
    public static int A[][] = new int[n][n];

    public static List<Integer> list = new ArrayList<>();
    public static int L = 0;
    public static int R = n-1;
    public static int B = n-1;
    public static int T = 0;


    public static void LR(int i, int j){

        while(j<=R){
            list.add(A[i][j]);
            j++;
        }

    }

    public static void TB(int i, int j){

        while(i<=B){
            list.add(A[i][j]);
            i++;
        }
    }

    public static void RL(int i, int j){

        while(j>=L){
            list.add(A[i][j]);
            j--;
        }
    }

    public static void BT(int i, int j){

        while(i>=T){
            list.add(A[i][j]);
            i--;
        }
    }

    public static void check(){


        while(L<=R && T<=B){
            LR(T,L);
            T++;

            TB(T,R);
            R--;

            if (T <= B) {
                RL(B, R);
                B--;
            }


            if (L <= R) {
                BT(B, L);
                L++;
            }

        }
    }

    public static void main(String[] args) {

        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = value++;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("---------------------");
        check();

        System.out.println(list);
    }
}


class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if (matrix == null || matrix.length == 0) return result;

        int n = matrix.length;
        int m = matrix[0].length;

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        while (top <= bottom && left <= right) {

            // Left to Right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;

            // Right to Left (only if row remains)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // Bottom to Top (only if column remains)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;
    }
}
