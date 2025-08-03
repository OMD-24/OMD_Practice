
import java.lang.annotation.Target;

/*
 * 
 * Compute mid, map it to 2D: row = mid / n, col = mid % n.

Compare matrix[row][col] to target:

If equal, return true.

If greater, shrink right half (end = mid - 1).

If smaller, shrink left half (start = mid + 1).

Loop until search space is exhausted; if not found, return false.

Time: O(log(m*n))
Space: O(1)
 */
public class q_74 {
    /**
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

    
        int start = 0;
        int end = (m*n) - 1;

        while(start<=end){

            int mid = (start + end)/2;
            int i = mid / n;
            int j = mid % n;

            if(matrix[i][j] == target){
                return true;
            }

            else if(matrix[i][j]>target){
                end = mid - 1;
            }

            else start = mid + 1;
            

        }


        return false;
}

}
