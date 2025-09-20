package LeetCode;

import java.util.Scanner;

public class MaximumProductofWordLengths {

    public static boolean checks(String x, String y){
        for (int i=0; i<x.length(); i++){
            char c = x.charAt(i);
            if (y.contains(Character.toString(c))){
                return false;
            }
        }

        return true;
    }

    public static int maxProduct(String[] words){



        int maxProduct = 0;

        for(int i=0; i< words.length-1; i++){
            String check = words[i];
            for(int j=i+1; j< words.length; j++){
               if(checks(words[i],words[j])){
                   int product = words[i].length() * words[j].length();
                   maxProduct = Math.max(maxProduct,product);
               }
            }
        }

        return maxProduct;
    }


    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String A[] = new String[n];
        for(int i=0; i<n; i++){
            A[i] = sc.nextLine();
        }

        System.out.println(maxProduct(A));
    }
}
