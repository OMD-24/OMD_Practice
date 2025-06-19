package CodeForces;

import java.util.Scanner;

public class Brackets {



    public static boolean check(String s){
        int cnt = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    cnt++;
                } else if (cnt>0 && s.charAt(i) == ')') {
                    cnt--;
                }
            }

        return cnt==0;
    }


    public static String remove(String s, int open, int close){
        String ans = "";
        int newOpen = open;
        int newClose = close;
        while (open<s.length()){
            if(s.charAt(open)=='('){
                ans = s.substring(0,open) + s.substring(open+1);
                newOpen = open;
                break;
            }
            open++;
        }
        close = open;

        while(close<s.length()){
            if(s.charAt(close)==')'){
                String temp = ans.substring(0,close) + ans.substring(close+1);
                newClose = close;

                if (!check(temp)){
                    return "yes";
                }

                else {
                    if (remove(temp, newOpen + 1, newClose).equals("yes")) return "yes";
                    if (remove(temp, newOpen, newClose + 1).equals("yes")) return "yes";
                    if (remove(temp, newOpen + 1, newClose + 1).equals("yes")) return "yes";
                }
            }
            close++;
        }
        return "no";

    }



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for(int t=0; t<T; t++) {
            String s = sc.nextLine();
            System.out.println(remove(s,0,0));

        }
    }
}
