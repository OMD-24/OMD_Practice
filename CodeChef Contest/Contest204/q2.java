package Contest204;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t=0; t<T; t++){

            int n = sc.nextInt();
            int k = sc.nextInt();

            int time = n*k;

            int h = time / 60;
            int m = time % 60;

            System.out.println(h+" "+m);

        }
    }
}
