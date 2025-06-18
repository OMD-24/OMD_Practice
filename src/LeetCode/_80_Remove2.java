package LeetCode;

public class _80_Remove2 {
    public static int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;

        int i = 0;
        int j =1;
        int k =2;

        while(k< A.length){
            if(A[i]==A[k]){
                k++;
            } else if (A[i]!=A[k]) {
                i++;
                A[i] = A[k];
                k++;

            }

        }
        return i+1 ;
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 2, 2, 2, 2, 3};


        System.out.println(removeDuplicates(nums));
        ;
    }
}