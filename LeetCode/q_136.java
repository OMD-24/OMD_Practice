package LeetCode;

import java.util.Arrays;

public class q_136 {

    public int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);
        int n = 0;
        for(int i=0; i<nums.length-1 ; i=i+2){
            if(nums[i] != nums[i+1]){
                n = nums[i];
            }
        }
        return nums[n];
    }
}
