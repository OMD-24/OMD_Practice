import java.util.Scanner;

public class CoverInWater {


    public static int[] check(String s){

        int A[] = new int[2];
        int cnt =0;
        int block = 0;
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '.'){
                cnt++;
            }
            else if(ch == '#'){
                cnt = 0;
                block++;
            }
            if(cnt == 3){
                 flag = 1;
                 break;
            }

        }
        A[0] = flag;
        A[1] = block;

        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){
            int n = sc.nextInt();
            sc.nextLine();
            
            String s = sc.nextLine();

            int A[] = check(s);
            if(A[0] == 1){
                System.out.println(2);
            }
            else 
            {
                System.out.println(n - A[1]);
            }




           
        }

    }
}
