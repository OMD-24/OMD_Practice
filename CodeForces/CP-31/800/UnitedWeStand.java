
import java.util.ArrayList;
import java.util.Scanner;

public class UnitedWeStand {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int A[] = new int[n];

            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            ArrayList b = new ArrayList<>();
            ArrayList c = new ArrayList<>();

            boolean duplicate = true;
            int max = A[0];
            for (int i = 0; i < n-1; i++) {
                if(A[i] != A[i+1]) duplicate = false;
                max = Math.max(max, A[i+1]);
            }
            for(int i=0; i<n; i++){
                if(A[i] == max){
                    c.add(A[i]);
                }

                else b.add(A[i]);
            }

            if(duplicate){
                System.out.println(-1);
            }

            else {
                System.out.println(b.size() + " " + c.size());
                for(int i=0; i<b.size()-1;i++){
                    System.out.print(b.get(i) + " ");
                }
                System.out.print(b.get(b.size()-1));
                System.out.println();

                for(int i=0; i<c.size()-1;i++){
                    System.out.print(c.get(i) + " ");
                }
                System.out.print(c.get(c.size()-1));
                System.out.println();
            }


        }
    }
}
