package Contest197;

import java.util.List;
import java.util.Scanner;

public class Pair {



        public static int fact(int n){
            if(n==0){

                return 1;
            }
            int factn = n * fact(n-1);
            return factn;
        }

    public static void check(String A , String sb){
        if(A.length() == 0){
            for (int j=0; j<sb.length(); j++){
                System.out.print((int)sb.charAt(j));
            }
            System.out.println();
            return;
        }

        for(int i=0; i<A.length(); i++ ){

            char currChar = A.charAt(i);

            //"abcde" = "ab" + "de"

            String newStr = A.substring(0,i)+ A.substring(i+1);
            check(newStr,sb+currChar);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String S = "";
        for (int i=0; i<n; i++){
            S+= (char)(i+1);
        }
        System.out.println(fact(n));
        check(S,"");


    }
}
