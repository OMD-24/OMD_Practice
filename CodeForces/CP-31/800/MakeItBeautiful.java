import java.util.Arrays;
import java.util.Scanner;

public class MakeItBeautiful {

    public static boolean check(int n , int []A){
        for(int i=0; i<n-1; i++){
            if(A[i] != A[i+1]) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int[] A = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            }

            if(!check(n,A)){
                System.out.println("NO");
            }

            else {
                System.out.println("YES");

                System.out.print(A[0]);
                int i = 1;
                int j= n-1;
                while(i<=j){
                    System.out.print(" "+A[j]);
                    if(i!=j ){
                        System.out.print(" "+A[i]);
                    }
                    i++;
                    j--;
                }

                System.out.println();

                }


            }
        }
    }

