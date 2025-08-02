//  (n & (n - 1)) == 0 --> ensures only One bit is there.


public class q_342 {
     public boolean isPowerOfFour(int n){

        if(n<=0) return false;

        return check(n, 1, 0);
    }

    public boolean check(int n, int b, int i){
        if(i>=32){
            return false;
        }
        if((n & (n - 1)) == 0 && (n & b) == b ){
            return true;
        }
        return check(n, b<<2, i+2);
    }
    public static void main(String [] args){
        q_326 p = new q_326();
        boolean one = p.isPowerOfThree(64);
        boolean two = p.isPowerOfThree(22);
        System.out.println(one);
        System.out.println(two);
    }
}
