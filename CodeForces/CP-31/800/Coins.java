import java.util.Scanner;

public class Coins {

    public static boolean check(long n, long k) {
        if(k%2!=0) return true;
        else{
            if(n%2==0) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            if(check(n,k)){
                System.out.println("Yes");
            }

            else System.out.println("No");
        }
    }
}