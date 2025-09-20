package Contest188;

import java.util.Scanner;

public class Q3 {

    public static int sum(int []A, int g, int end, int sum){




            if ( sum % 3 == 0) {
                return sum;

            }

        if(g+1 <=end) {
            sum(A, g + 1, end, sum);
            sum(A, g + 1, end, sum + A[g]);
        }


            return sum;

    }


    public static boolean check (int []A){



        int n = A.length;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){




//                for(int g=i; g<=j ; g++){
//                    sum += A[g];
//                }
               int s = sum(A,i,j,0);

                if(s%3==0 && s != 0){
                    return true;
                }



            }
        }

        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k=0; k<t; k++){

            int n = sc.nextInt();
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }



            if(check(A)){
                System.out.println("yes");
            }
            else
                System.out.println("no");

        }


    }
}
