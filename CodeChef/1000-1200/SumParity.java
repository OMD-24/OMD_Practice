import java.util.Scanner;

public class SumParity {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int n = sc.nextInt();
           
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            
            }

            int one = 0;
            for(int x : A){
                if(x == 1){
                    one++;
                }
            }
            if(one%2 == 0){
                System.out.println("Yes");
            }
            else
            System.out.println("No");
           
        }
    }
}
