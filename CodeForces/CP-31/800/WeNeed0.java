import java.util.*;

public class WeNeed0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int A[] = new int[n];

            int xor = 0;

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
                xor = xor ^ A[i];
            }

            if(n%2 !=0){
                System.out.println(xor);
            }

            else {
                if(xor == 0){
                    System.out.println(0);
                }
                else System.out.println(-1);
            }
        }
    }
}
