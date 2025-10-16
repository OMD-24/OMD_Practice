import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] A = new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = sc.nextInt();
            }

            ArrayList<Integer> list = new ArrayList<>();
            list.add(A[0]);
            for(int i =0; i<n-1; i++){
                if(A[i]>A[i+1]){
                    if(A[i+1]>1) {
                        list.add(A[i + 1] - 1);
                    }
                    else {
                        list.add(A[i + 1]);
                    }
                }

                 list.add(A[i+1]);
            }


            System.out.println(list.size());
            for(int i=0; i<list.size()-1;i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.print(list.get(list.size()-1));
            System.out.println();
        }
    }
}