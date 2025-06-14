package CodeForces;

import java.util.Scanner;

public class Watermelon {

    public static String check(int n){
        if (n<4 ||n%2!=0){
            return "NO";

        }

        else return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(check(n));
    }
    
}
