import java.util.*;

public class Jellyfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            int n = sc.nextInt();

            long sec = 0;
            for(int i = 0; i < n; i++) {
                long x = sc.nextLong();
                sec += Math.min(x, a - 1);
            }

            System.out.println(b + sec);

        }
    }
}
