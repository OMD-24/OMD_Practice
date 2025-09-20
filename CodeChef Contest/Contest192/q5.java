//package Contest192;
//import java.util.*;
//
//public class q5 {
//
//    public static int check(int[] A) {
//        int a = Integer.MAX_VALUE;
//
//        for (int i = 0; i < A.length; i++) {
//
//            int remainingPeople = Math.max(A[i] - i, 0); // People still in queue when you arrive
//            int totalTime = i + remainingPeople; // Total time to leave from queue i
//
//            minTime = Math.min(minTime, totalTime);
//        }
//
//        return minTime;
//    }
//
//    public static void main(String [] args){
//        Scanner sc = new Scanner(System.in);
//
//        int T = sc.nextInt();
//        for(int t=0; t<T; t++){
//
//            int n = sc.nextInt();
//            int A[] = new int[n];
//            for(int i=0; i<n; i++){
//                A[i]= sc.nextInt();
//            }
//
//
//            System.out.println(check(A,0,0));
//
//        }
//
//    }
//}
