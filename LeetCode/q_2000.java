package LeetCode;

public class q_2000 {
    class Solution {
        public String reversePrefix(String word, char ch) {
            char[] arr = word.toCharArray();
            int i = 0;
            while (i < arr.length && arr[i] != ch) {
                i++;
            }
            if (i == arr.length) return word;
            int left = 0, right = i;
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            return new String(arr);
        }
    }
}
