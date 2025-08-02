import java.util.Scanner;

public class Candies {

    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;

        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);

        merge(arr,si,mid,ei);

    }


    public static void merge(int arr[], int si, int mid, int ei){

        int temp[] = new int [ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;

        while (i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else {
                temp [k] = arr[j];
                j++;
            }
            k++;
        }
        //for leftover elements of 1st sorted part
        while (i<=mid){
            temp[k++] = arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while (j<=ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for (k=0, i=si; k<temp.length;  k++,i++){
            arr[i]=temp[k];
        }



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t=0; t<T; t++){

            int n = sc.nextInt();
           
            int A[] = new int[n];
            for(int i=0; i<n; i++){
                A[i] = sc.nextInt();
            
            }

            mergeSort(A, 0, n-1);
        
            boolean b = false;
            for(int i=0; i<n-2; i++){

                int one = A[i];
                int two = A[i+1];
                int three = A[i+2];
                

                if(one == two && two == three ){
                    b=true;
                }
            }
            if(b) System.out.println("No");
            else System.out.println("Yes");
        
        }
    }
}
