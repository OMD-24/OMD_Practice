import java.util.Scanner;

public class GameWithInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            if(n%3 == 0){
                System.out.println("Second");
            }

            else System.out.println("First");
            

           
        }

    }
}
