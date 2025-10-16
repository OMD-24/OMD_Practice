import java.util.Scanner;

public class DontTryToCount {


    public static int check(int n, int m, String x, String s){
          String curr = x;
          int cnt = 0;
          while(curr.length() <= 50){
              if(curr.contains(s)){
                  return cnt;
              }

              cnt++;
              curr += curr;
          }

          return -1;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0 ; t<T; t++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine();
            String x = sc.nextLine();
            String s = sc.nextLine();

            System.out.println(check(n,m,x,s));

        }
}

}