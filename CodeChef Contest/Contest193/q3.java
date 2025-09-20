package Contest193;
import java.util.*;


public class q3 {

    public static String check(int a, int b){
        if(a==0){
            return "no";
        }

        if(b==0){
            return "yes";
        }



        if(b%a==0){
            return "yes";
        }
        else return "no";
    }



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t =0 ; t<T; t++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(check(a,b));
        }
    }
}
