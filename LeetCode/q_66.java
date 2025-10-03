package LeetCode;

public class q_66 {

    class Solution {
        public int[] plusOne(int[] digits) {
            int n = digits.length - 1;
            while (n >= 0) {
                if(digits[n]  < 9){
                    digits[n] = digits[n] +1;
                    return digits;


                }
                digits[n] = 0;
                n--;

            }

            int newDigits [] = new int [digits.length +1];
            newDigits[0] = 1;

            for(int i=1; i<newDigits.length; i++){
                newDigits[i] = 0;

            }
            return newDigits;
        }
    }
}
