import java.util.Arrays;


public class q_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length/2];
        return mid;
    }
}
