package Contest187;

import java.util.Scanner;

public class q3 {


    public static int cut(int m, int n, int k) {


        int r =0;
        int y=0;
        int c=0;

        for(int i=1; i<m; i++) {
            //horizontal
            int p1 = i * n;
            int p2 = (m - i) * n;

            if (p1 >= k) r = Math.max(r, p2);
            if (p2 >= k) r = Math.max(r, p1);

        }
        for (int j = 1; j < n; j++) {
            int p1 = m * j;
            int p2 = m * (n - j);

            if (p1 >= k) r = Math.max(r, p2);
            if (p2 >= k) r = Math.max(r, p1);
        }

        if (k == 0) {
            r = m*n;
        }


        return r;




    }

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(cut(m,n,k));


        }


    }
}


