package LeetCode;

public class ContainerWithMostWater {
    public int maxArea(int[] height){


    int maxWater =0;

    int i=0;
    int j= height.length-1;
    while(i<j){
        int water = Math.min(height[i],height[j])*(j-i);
        maxWater = Math.max(maxWater, water);
        if (height[i]<height[j]){
            i++;
        }
        else {
            j--;
        }
    }
    return maxWater;
    }
}
