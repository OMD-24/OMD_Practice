import java.util.Scanner;

public class DremyPaint {


    public static boolean check(int [] A){
        int a = A[0];
        int b = A[0];
        int bc = 1;

        int i = 1;
        while(i<A.length){
            if(A[i] != a){
                b = A[i];
                break;
            } 
            i++;       
            
        }


        while(i<A.length){
            if(A[i] != a || A[i] != b){
                return false;
            }
            if(A[i] == b){
                bc++;
            }
            i++;
        }

        if(bc == 0 || A.length/2 == bc)
        return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int A[] = new int[n];
            for (int i = 0; i < n; i++) {
                A[i]= sc.nextInt();
            }

            if(check(A)){

                System.out.println("Yes");
            }

            // else if(n == 2){
            //     System.out.println("Yes");
            // }

            // else if ((n == 3) && ((A[0] == A[1]) || (A[0] == A[2] || (A[2] == A[1])) )) {
            //     System.out.println("Yes");
            // }
            else System.out.println("No");

           
        }

    }
}
