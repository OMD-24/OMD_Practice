public class q_326 {

    public boolean isPowerOfThree(int n){

        if(n<=0) return false;

        if(n==3 || n==1) return true;
        
        
       if( n % 3 == 0){
        n = n / 3;
        return isPowerOfThree(n);
       }

       else
        return false;
    }
    public static void main(String [] args){
        q_326 p = new q_326();
        boolean one = p.isPowerOfThree(27);
        boolean two = p.isPowerOfThree(22);
        System.out.println(one);
        System.out.println(two);
    }
}