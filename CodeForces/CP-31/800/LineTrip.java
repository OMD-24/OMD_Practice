import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = sc.nextInt() ;
            }

            int max = ar[0];


            for (int i = 0; i < n-1; i++) {
                
                int m = ar[i+1] - ar[i];
            
                max = Math.max(m, max);
            }

            int y = 2*(x- ar[n-1]);
            max = Math.max(y, max);

            System.out.println(max);
        }

    }
}
