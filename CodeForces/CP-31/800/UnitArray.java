import java.util.Scanner;

public class UnitArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {

            int n = sc.nextInt();
            int A[] = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            int m = 0;
            int p = 0;
            for (int i = 0; i < n; i++) {
                if (A[i] == 1) {
                    p++;
                } else m++;
            }
            int cnt = 0;
            while (m > p) {
                m--;
                p++;
                cnt++;
            }

            if(m %2 ==0)
            System.out.println(cnt);

            else System.out.println(cnt + 1);
        }
    }
}