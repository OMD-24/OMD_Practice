
import java.util.ArrayList;
import java.util.Scanner;

public class UnitedWeStand {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int A[] = new int[n];

            ArrayList b = new ArrayList<>();
            ArrayList c = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < A.length; j++) {
                    if(A[j] != A[i] && A[j] % A[i] == 0){
                        b.add(A[i]);
                    }
                    else c.add(A[i]);
                    
                }
                
            }

            if(b.size() == 0 || c.size() == 0){
                System.out.println(-1);
            }

            else 
            {

            System.out.println(b.size() + " " + c.size());
            for (int i = 0; i < b.size(); i++) {
                System.out.print(b.get(i)+" ");
            }

            System.out.println();

            for (int i = 0; i < c.size(); i++) {
                System.out.print(c.get(i)+" ");
            }

        }
        }
    }
}
