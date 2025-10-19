import java.util.*;

public class Vasilije {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            long  n = sc.nextLong();
            long  k = sc.nextLong();
            long  x = sc.nextLong();
            long  min = k*(k+1) / 2;
            long  i = n-k;
            long  j = n;
            long max =  k * (2 * n - k + 1) / 2;
//            long  max = 0;
//            while (j>i){
//                max +=  j;
//                j--;
//            }


            if(min <= x && x<= max){
                System.out.println("YES");
            }

            else System.out.println("NO");
        }
    }
}
