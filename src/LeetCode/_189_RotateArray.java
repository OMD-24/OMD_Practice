package LeetCode;

public class _189_RotateArray {

    public static void helperBack(int []nums, int n){
        if(n == 0 ){
            return;
        }

        int prev = nums[0];
        for(int i= nums.length-1 ; i>=0; i--){
            int curr = nums[i];
            nums[i] = prev;
            prev = curr;
        }
        helperBack(nums,n-1);
    }

    public static void helperfront(int [] nums , int n){


        if(n == 0 ){
            return;
        }

        int prev = nums[nums.length-1];
        for(int i=0; i< nums.length; i++){
            int curr = nums[i];
            nums[i] = prev;
            prev = curr;
        }
        helperfront(nums,n-1);
    }

    public static void rotate(int [] nums , int key){


        int n = key % nums.length;
        int mid = nums.length/2 -1;
        if(n<=mid) {
            helperfront(nums, n);
        }
        else if(n>mid){
            helperBack(nums,nums.length-n);
        }
    }


    public static void main(String [] args){
        int nums[] = {1,2,3,4,5,6,7};

        rotate(nums,3);
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] +" -> ");
        }
        System.out.println();

    }
}
