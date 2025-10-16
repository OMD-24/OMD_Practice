import java.util.*;

public class que4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }
            Arrays.sort(A);

            int g = -1;
            boolean che = false;
            for(int i=n-2; i>=0; i--){
                if((A[i+1]-1) > A[i]){
                    g = A[i+1]-1;
                    if(g % A[i] !=0){
                        che = true;
                        break;
                    }

                }
            }

            if(che){
                System.out.println(g);
            }

            else {
                System.out.println(A[0]-1);
            }


        }
    }
}
