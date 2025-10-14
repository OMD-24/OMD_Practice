import java.util.Scanner;

public class ExtremelyRound {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            int digits = (int)Math.floor(Math.log10(Math.abs(n))) + 1;

            int firstDigit = n;
            while (firstDigit >= 10) {
                firstDigit /= 10;
            }

            System.out.println(((digits-1)*9) + firstDigit );
        }
    }
}
