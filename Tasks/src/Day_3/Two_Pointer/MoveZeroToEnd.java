package Day_3.Two_Pointer;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZeroToEnd(arr);
    }
    private static void moveZeroToEnd(int[] arr){
        int n = arr.length;
        int st = 0, end = n-1;
        System.out.println("Before Shifting : "+ Arrays.toString(arr));
        while(st < end){
            if(arr[end]==0){
                end--;
            }
            if(arr[st]==0){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }else{
                st++;
            }
        }
        System.out.println("After Shifting : "+Arrays.toString(arr));
    }
}
