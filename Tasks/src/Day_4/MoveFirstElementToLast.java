package Day_4;

import java.util.Arrays;

public class MoveFirstElementToLast {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("Before Swap : "+ Arrays.toString(arr));
        int temp = arr[0];
        for(int i=0;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
        System.out.println("After Swap : "+Arrays.toString(arr));
    }
}
