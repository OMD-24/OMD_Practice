import java.util.Scanner;

public class ForbiddenInteger {

    public static boolean check(int n, int k, int x){
        if(k==1 && x==1){
            return false;
        }

        if(k==2 && x==1 && n%2 != 0){
            return false;
        }
         return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int x = sc.nextInt();

            if(check(n,k,x))
                System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
