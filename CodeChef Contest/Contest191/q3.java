package Contest191;

import java.util.Scanner;

public class q3 {

    public static int check(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }


//    public static int check(int x, int y){
//
//        if(x%y==0 || y%x == 0){
//            return Math.min(x,y);
//        }
//
//        int z = 2;
//        int sqx = (int) Math.sqrt(x);
//        int sqy = (int) Math.sqrt(y);
//        while(z<=Math.min(sqx,sqy)) {
//            if (x % z == 0 && y % z == 0) {
//                return z;
//            }
//            z++;
//        }
//        return 1;
//    }

    public static int getGCD(int x, int y){

        int count = 0;
        if(check(x,y) > 1 ){
            return 0;
        } else if (check(x+1,y)>1) {
            return 1;
        }

        else if(check(x,y+1)>1){
            return 1;
        }

        else return 2;

    }


    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            System.out.println(getGCD(x,y));

        }



    }
}
