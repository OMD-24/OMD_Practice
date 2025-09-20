package Contest187;

import java.util.Scanner;

public class q2 {


    public static int cut(int m, int n, int k) {

        int i=1;
        int j=1;
        int c1=0;
        int c2=0;

        while(i<m || j<n) {
            if (k <= (n * i)) {
                c1 = (m * n) - (n * i);

            }

            if (k <= (m * j)) {
                c2 = (m * n) - (m * j);
            }
            i++;
            j++;
        }

            int result = Math.min(c1,c2);
            return result;






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


