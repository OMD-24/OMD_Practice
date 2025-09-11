import java.util.Scanner;

public class GoalsOfVictory {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0 ; t<T; t++){
            int n = sc.nextInt();

        int A[] = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            A[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += A[i];
        }

        System.out.println(0-sum);

        }
    }
}
