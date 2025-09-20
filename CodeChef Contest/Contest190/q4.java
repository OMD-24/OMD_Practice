//package Contest190;
//
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class q4 {
//
//    public static void main(String args[]){
//
//        Scanner sc = new Scanner(System.in);
//
//    }
//}
//public static int ope(int[] A) {
//    // Copy the array so that original A is not modified
//    LinkedList<Integer> list = new LinkedList<>();
//    for (int value : A) list.add(value);
//
//    int score = 0;
//
//    while (list.size() > 1) {
//        int maxScore = -1;
//        int index = 0;
//
//        // Try all adjacent pairs and pick the one giving highest min()
//        for (int i = 0; i < list.size() - 1; i++) {
//            int min = Math.min(list.get(i), list.get(i + 1));
//            if (min > maxScore) {
//                maxScore = min;
//                index = i;
//            }
//        }
//
//        score += Math.min(list.get(index), list.get(index + 1));
//        // Remove the max of the selected pair
//        if (list.get(index) > list.get(index + 1)) {
//            list.remove(index);
//        } else {
//            list.remove(index + 1);
//        }
//    }
//
//    return score;
//}