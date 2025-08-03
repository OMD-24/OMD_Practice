public class q_153 {

    public int findMin(int[] nums) {
     
        int i = 0;
        int j = nums.length-1;

        while(i<=j){
            int mid  =  (i+j)/2;
            if(nums[i]<=nums[j]){
                return nums[i];
            }

            if(nums[mid]>nums[j]){
                i = mid +1;

            }

            else{
                j = mid;
            }
        }

        return nums[i];
        
    }

    public static void main(String[] args) {
        int nums[] = {11,13,15,17};
        q_153 o = new q_153();
        System.out.println(o.findMin(nums));
    }
}