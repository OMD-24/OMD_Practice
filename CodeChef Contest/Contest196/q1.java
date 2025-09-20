package Contest196;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int e = sc.nextInt();

        if(e>=(3*m)){
            System.out.println("Rain");
        }
        else System.out.println("Dry");
     }
}
