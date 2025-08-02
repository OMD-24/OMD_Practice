public class q_35 {

    public int searchInsert(int[] nums, int target){

        int a = 0;
        int b = nums.length -1;
        while(a<=b){

            int mid = a + (b-a)/2;

            if(nums[mid]==target){
                return mid;
            }

            if(nums[mid]<target){
                a=mid+1;
            }

            else {
                b=mid-1;
            }

        }

        return a;
    }

    public static void main(String[] args) {
        int A[] = {1,3,5,6};
        q_35 o = new q_35();

        int idx = o.searchInsert(A, 2);
        System.out.println(idx);
    }
}
