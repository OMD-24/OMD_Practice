import java.util.*;


public class ATMMachine{

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            
            }

            String str = "";
z
            for(int i=0; i<n; i++){
                if(A[i]<=k){
                    k=k-A[i];
                    str += "1";
                }
                else str += "0";
            }
            System.out.println(str);
        }
    }
}