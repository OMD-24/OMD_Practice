
import java.util.Scanner;

public class ACoverinWater {

    public static int check(String str){
        int block = 0;
        int blank = 0;
        int three = 0;
        int i = 0;
        while(i<str.length()){
            char ch = str.charAt(i);
            if(ch == '#'){
                three = 0;
                block++;
            }
            if(ch == '.'){
                three ++;
                blank ++;
            }

            if(three == 3){
                return 2;
            }
            i++;
        }

        return blank;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0 ; t<T; t++){
            int n = sc.nextInt();

        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(check(str));
        }
    }
}