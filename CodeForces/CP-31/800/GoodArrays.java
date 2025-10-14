import java.util.Scanner;

public class GoodArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            int even = 1;
            int odd = 1;
            int prev = A[0] ;

            for(int i=1; i<n; i++){
                int curr = A[i];
                if(prev %2==0 && curr%2 == 0){
                    even++;
                }
                if(prev %2!=0 && curr%2 != 0){
                    odd++;
                }
                prev = curr;
            }

            System.out.println(even+odd-2);
        }
    }
}