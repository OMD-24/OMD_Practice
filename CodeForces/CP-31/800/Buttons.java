import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int x =0; 
            int y =0;

            if(c%2 == 0){
                x = a+ c/2;
                y = b+ c/2;
            }

            else {
                x = a+ c/2 + 1;
                y = b+ c/2;
            }

            if(x>y){
                System.out.println("First");
            }

            else System.out.println("Second");
        }
    }
}
