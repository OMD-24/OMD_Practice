package LeetCode;

public class q_1922 {

    class Solution {
        public int countGoodNumbers(long n) {
            if(n%2 ==0){
                return (int)(Math.pow(5,n/2) * Math.pow(4,n/2));
            }

            else
                return (int)(Math.pow(5,n/2+1) * Math.pow(4,n/2));
        }
    }
}
