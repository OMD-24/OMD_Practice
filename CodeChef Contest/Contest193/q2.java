package Contest193;
import java.util.*;


public class q2 {

    public static void check(ArrayList<Integer> list){
        int odd = 0;
        int even = 0;

        for(int i=0; i< list.size() ; i++){
            if(list.get(i) %2 == 0){
                even++;
            }
            else odd++;
        }
        System.out.println(odd+" "+even);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {

            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
            list.add(n);
            check(list);
        }
    }
}