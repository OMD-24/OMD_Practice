import java.util.*;


public class EasyPronunciation{

    public static boolean check(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return false;
        }
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            boolean b = false;

            for(int i=0; i<n-4; i++){
                char one = str.charAt(i);
                char two = str.charAt(i+1);
                char three = str.charAt(i+2);
                char four = str.charAt(i+3);

                if(check(one) && check(two) && check(three) && check(four)){
                    b=true;
                }
                
            }
            if(b) System.out.println("No");
            else System.out.println("Yes");
        }
    }
}