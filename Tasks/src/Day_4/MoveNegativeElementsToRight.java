package Day_4;

import java.util.Arrays;

public class MoveNegativeElementsToRight {
    public static void main(String[] args) {
        int[] arr = {5,-1,2,3,-7,-2,0,-4};
        int n = arr.length;
        int st = 0, end = n-1;
        int i = 0;
        int[] res = new int[n];
        while(i < n){
            if(arr[i] < 0){
                res[st++] = arr[i];
            }else{
                res[end--] = arr[i];
            }
            i++;
        }
        System.out.println(Arrays.toString(res));
    }
}