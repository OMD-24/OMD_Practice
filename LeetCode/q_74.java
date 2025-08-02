
import java.lang.annotation.Target;

public class q_74 {
    /**
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m-1;

        while(top<=bottom){
            int vmid = top + (bottom - top)/2;
            if(top == bottom - 1){
                
                int i = 0;
                int j = n-1;
                while(i<=j){
                    int mid = (i+j)/2;
                    if(matrix[top][mid] == target){
                        return true;
                    }

                    else if(matrix[top][mid] < target){
                        j = mid -1;
                    }

                    else i = mid + 1;
                }

                return false;
            }

            if(matrix[vmid][0]== target){
                return true;
            }


            if(matrix[vmid][0] < target){
                top = vmid;
            }
            else bottom = vmid;
        }


        return false;
}

}
