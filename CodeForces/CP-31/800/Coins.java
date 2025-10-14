import java.util.Scanner;

public class Coins {

    public static boolean check(int n, int k) {
        if (n < (2 * k)) {
            if ((n % 2 != 0 && k % 2 == 0) || (n % 2 == 0 && k % 2 != 0))
                return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if(check(n,k)){
                System.out.println("Yes");
            }

            else System.out.println("No");
        }
    }
}