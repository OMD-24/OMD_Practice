public class q_390 {

    public int lastRemaining(int n){

        int A[] = new int[n];
        for(int i=0; i<n; i++){
            A[i] = i+1;
        }

    
        return check(n, A);
    }

    public int check(int n , int[] A){

        if(n==1){
            return A[0];
        }

        int nek = 0;
        for(int i=1; i<n; i=i+2){
            A[nek] = A[i];
            nek++;
        }
        
        int nek2 = nek / 2;
       
        for(int i=nek-2; i>=0; i=i-2){
            A[nek2-1] = A[i];
            nek2--;
        }

        if(nek %2 == 0) n = nek/2;
        if(nek %2 != 0) n = (nek/2) +1;
        return check(n , A);
    }
    public static void main(String[] args) {
        q_390 p = new q_390();
        int r = p.lastRemaining(10);
        System.out.println(r);
    }
}