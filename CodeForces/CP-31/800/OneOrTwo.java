import java.util.Scanner;

public class OneOrTwo {

    public static int check(int[] A, int n){
        int two = 0;
        int one = 0;
        for(int i=0; i<n; i++){
            if(A[i] == 1) one++;
            else two++;
        }

        if(two == 0) return 1;
        if(two % 2 == 1){
            return -1;
        }
        int cnt = 0;
        if(two % 2 ==0){
            for(int i=0; i<n; i++){
                if(A[i] == 2){
                    cnt++;
                }
                if(cnt == (two/2) ){
                    return i+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            System.out.println(check(A,n));


        }
    }
}
