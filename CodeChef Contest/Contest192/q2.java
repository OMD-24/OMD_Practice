package Contest192;
import java.util.*;

public class q2 {

    public static boolean checkSum(ArrayList<Integer> list){

        for(int i=0; i< list.size(); i++){
            for(int j=i+1; j< list.size(); j++){
               int sum = list.get(i) + list.get(j);
               if(sum%2 != 0){
                   return false;
               }
            }

        }
        return true;
    }

    public static void removeOne(ArrayList<Integer> list){
        int e = 0;
        for(int i=0; i<list.size(); i++){
            if (list.get(i)==1){
                e++;
                if(e==2){

                }
            }
        }
    }

    public static void removeTwo(ArrayList<Integer> list){

    }



//    public static int operations(ArrayList<Integer> list){
//
//        int ope = 0;
//        if ()
//    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t=0; t<T; t++){


        }

    }
}
