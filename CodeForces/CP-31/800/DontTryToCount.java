//import java.util.Scanner;
//
//public class DontTryToCount {
//
//
//    public static int check(int n, int m, String x, String s){
//          for (int i = 0; i < n; i++) {
//
//                if(x.charAt(i) == s.charAt(0))
//                {
//                int cnt = 1;
//                int j=i+1;
//
//                while(cnt<m ){
//                    if(x.charAt(j) == s.charAt(cnt)){
//                        cnt++;
//                    }
//                    else break;
//                }
//                if(cnt == m ) return cnt;
//            }
//            }
//
//            return -1;
//    }
//
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
//        for(int t = 0 ; t<T; t++){
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            sc.nextLine();
//            String x = sc.nextLine();
//            String s = sc.nextLine();
//
//            if(check(n,m,x,s)) {
//                System.out.println("Treu");
//            }
//
//
//
//        }
//}
//
//}