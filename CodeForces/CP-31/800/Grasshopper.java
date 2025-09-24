import java.util.Scanner;

public class Grasshopper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int x = sc.nextInt();
            int k = sc.nextInt();

            if(x%k !=0){
                System.out.println(1);
                System.out.println(x);
            }
            else {


                        System.out.println(2);
                        System.out.println(1+" "+(x-1));


                }
            }


    }
}
