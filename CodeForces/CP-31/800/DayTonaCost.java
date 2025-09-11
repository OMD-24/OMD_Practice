import java.util.Scanner;

public class DayTonaCost {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0 ; t<T; t++){
            int n = sc.nextInt();
            int k = sc.nextInt();

        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if(A[i] == k){
                flag = true;
            }
        }

        if(flag) System.out.println("Yes");
        else System.out.println("No");
        

    }
}
}