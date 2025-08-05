
class q_189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;          // nothing to do
        k = k % n;                   // normalize k if it's >= n
        if (k == 0) return;          // no rotation needed

        reverse(nums, 0, n - 1);     // reverse whole array
        reverse(nums, 0, k - 1);     // reverse first k
        reverse(nums, k, n - 1);     // reverse rest
    }

    private void reverse(int[] nums, int i, int j) {
        while (i < j) {              // use < (not <=) to avoid redundant swap when i==j
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
