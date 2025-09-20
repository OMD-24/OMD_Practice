package LeetCode;

import java.util.Scanner;



public class LongestSubstringWithoutRepeatingChar {

    public static void check(String str) {

        String sm ="";
        String snew = str;



        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j)) {

                    sm += str.charAt(j);

                }
            }
            if(snew.equals(sm)){
                System.out.println(sm);
            }
            else{
                check(sm);
            }


        }
    }

    public static void main(String[] args){
        String str;

        System.out.println("Enter");
        Scanner sc= new Scanner(System.in);
        str = sc.next();
        check(str);

    }
}
