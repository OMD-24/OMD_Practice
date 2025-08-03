public class q_162 {

    public int findPeakElement(int[] nums) {
     
        int i = 0;
        int j = nums.length -1;
        while(i<=j){

            int mid = (i+j)/2;

            if(nums[mid]<nums[mid+1]){
                i = mid +1;
            }

            else {
                j = mid ;
            }

            
        }

        return i;
    }


    public static void main(String[] args) {
        int nums[] = {11,13,15,17};
        q_162 o = new q_162();
        System.out.println(o.findPeakElement(nums));
    }
    
}
