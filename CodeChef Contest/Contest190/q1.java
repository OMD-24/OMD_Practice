package Contest190;

import java.util.Scanner;

public class q1 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = 25-x;
        if(y%4==0) {
            System.out.println(y / 4);
        }
        else {
            System.out.println((y/4)+1);
        }
    }
}
