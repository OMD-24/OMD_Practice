package Contest204;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t=0; t<T; t++){

            int n = sc.nextInt();
            int m = sc.nextInt();

            sc.nextLine();
            String str = sc.nextLine();

            int a  =0;
            int b=0;

           if(n%2==0) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '1') {
                        a++;
                    } else b++;
                }

                int remainingRounds = n - m;
                int diff = Math.abs(a - b);

                if (remainingRounds >= diff) {
                    System.out.println("Yes");
                } else System.out.println("No");
            }

           else System.out.println("No");

        }
    }
}
