public class q_58 {
     public int lengthOfLastWord(String s) {
        int n = s.length();
        boolean used = false;
        int cnt =0;
        for(int i = n-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                cnt ++;
                used = true;
            }

            if(used && (s.charAt(i) == ' ')){

                return cnt;
            }

        }
        return cnt;
    }
}
