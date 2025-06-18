package LeetCode;

public class _26_Remove {


    public static int removeDuplicates(int[] A) {
        if (A.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < A.length; j++) {
            if (A[j] != A[i]) {
                i++;
                A[i] = A[j];
            }
        }
        return i + 1;
    }

    public static void main(String [] args){
        int nums[] = {1,2,2,2,5,4,3};


        System.out.println(removeDuplicates(nums));;


    }
}
