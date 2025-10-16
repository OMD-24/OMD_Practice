import java.util.*;

public class qu3 {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for(int t=0; t<T; t++){
                int n = sc.nextInt();
                int x = sc.nextInt();
                int k = sc.nextInt();
                int A[] = new int[n];
                for(int i=0; i<n; i++){
                    A[i] = sc.nextInt();
                }
                Arrays.sort(A);
                int s = 100*k +x;
                int p = 1;
                for(int i=n-1; i>=0; i--){
                    if(A[i]>s){
                        p++;
                    }
                    else break;
                }

                if(p-k <=0){
                    System.out.println(1);
                }
                else {
                    System.out.println(p-k);
                }
            }


            }
    }

