package Contest197;

import java.util.ArrayList;
import java.util.Scanner;

public class Split {
    public static ArrayList<Integer> list = new ArrayList<>();

    public static int count(int n, int k){
        int q = n/k;
        int r = n%k;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i) <= (q+r))
            max = Math.max(list.get(i),max );
        }
        return max;
    }

    public static void check(String str, int cnt, char prev , int i){


        if(i==str.length()){
            System.out.println(list);
            return;
        }
        char curr = str.charAt(i);
        if((prev == '1') && (curr == '0')){
            list.add(cnt);
            check(str, 0, curr, i+1);
        }
        else check(str, cnt+1,curr,i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String str ;
       str=sc.nextLine();

       check(str,0,'0',0);

        System.out.println(count(n,k));
    }
}
