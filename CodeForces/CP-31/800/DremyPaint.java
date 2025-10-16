import java.util.*;

public class DremyPaint {

    public static boolean check(int[] A) {
        Map<Integer, Integer> freq = new HashMap<>();


        for (int x : A) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }


        if (freq.size() == 1) return true;


        if (freq.size() > 2) return false;


        Iterator<Integer> it = freq.values().iterator();
        int count1 = it.next();
        int count2 = it.next();

        return Math.abs(count1 - count2) <= 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            System.out.println(check(A) ? "Yes" : "No");
        }
    }
}
