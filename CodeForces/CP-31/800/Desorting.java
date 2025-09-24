import java.util.Scanner;

public class Desorting {


    public static int check(int[] A,int n){
        int  min =Integer.MAX_VALUE;
        for(int i=0; i<n-1; i++){
            int dif = A[i+1] - A[i];
            if(dif< 0){
                return 0;
            }

            else{
            min = Math.min(min, dif);

            }
        }

        return min/2 + 1;
    }


    public static void main(String[] args) {




        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t=0; t<T; t++){

            int n = sc.nextInt();
            int A[] = new int[n];

            for(int i=0; i<n; i++ ){
                A[i] = sc.nextInt();
            }

            System.out.println(check(A,n));


        }
    }

}
