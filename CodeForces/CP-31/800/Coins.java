import java.util.Scanner;

public class Coins {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t=0; t<T; t++){
            int x = sc.nextInt();
            int k = sc.nextInt();


            if(((x%2==0 && k%2 !=0) || (x%2!=0 && k%2 ==0))  && (x <(2*k) )){

                System.out.println("No");


            }

            else System.out.println("Yes");
        }
    }
}
