import java.util.*;

public class Chemisty {

    public static void check(){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            Map<Character, Integer> f = new HashMap<>();

            // Count frequency of each character
            for (char ch : s.toCharArray()) {
                f.put(ch, f.getOrDefault(ch, 0) + 1);
            }

            int m = f.size();
            int oddcnt  = 0;
            int even = 0;

            for (int freq : f.values()) {
                if (freq % 2 != 0)
                    oddcnt++;
            }

            boolean diff = (n-k)%2==0;
            if(diff && oddcnt - k <=0){
                System.out.println("Yes");
            } else if (!diff && (oddcnt - k == 1 || oddcnt - k<0)) {
                System.out.println("Yes");
            }

            else System.out.println("No");

        }
    }
}
