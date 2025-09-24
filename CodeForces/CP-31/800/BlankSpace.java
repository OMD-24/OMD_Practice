import java.util.Scanner;

public class BlankSpace {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {

            int n = sc.nextInt();
            int A[] = new int[n];

            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }


            int max = 0;
            int cnt = 0;
            for(int i=0; i<n; i++){
                if(A[i] == 0) {
                    cnt++;
                    max = Math.max(max,cnt);
                }
                else cnt = 0;
            }
            System.out.println(max);

        }
    }
}
