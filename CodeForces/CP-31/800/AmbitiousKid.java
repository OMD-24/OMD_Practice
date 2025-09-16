
import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int least = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            least = Math.min(least, Math.abs(A[i]));
        }

        System.out.println(least);
        
    }
}
