import java.util.Scanner;

public class PrependAppend {

    public static int check(int n, String s) {
        int a = 0;
        int b = n - 1;
        while (a < b) {

            if(s.charAt(a) == s.charAt(b)){
                break;
            }

            a++;
            b--;
        }

        int shortestLength = b - a + 1;
        if (shortestLength < 0) {
            return 0;
        }


        return shortestLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            System.out.println(check(n, s));
        }
    }
}