package Day_3.Two_Pointer;

import java.util.*;
public class ReverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //reverse1(arr);
        //reverse2(arr);
        reverse3(arr);
    }
    private static void reverse1(int[] arr) {
        int n = arr.length;
        System.out.println("Before Reverse_1 : "+Arrays.toString(arr));
        int st = 0, end = n-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
        System.out.println("After Reverse_1 : "+Arrays.toString(arr));
    }
    private static void reverse2(int[] arr) {
        int n = arr.length;
        int st = 0, end = (n%2==0)?n/2:(n/2)+1;
        System.out.println("Before Reverse_2 : "+Arrays.toString(arr));
        while(st < n/2 && end < n){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end++;
        }
        System.out.println("After Reverse_2 : "+Arrays.toString(arr));
    }
    private static void reverse3(int[] arr) {
        int n = arr.length;
        int end = (n%2==0)?n-1:n-2;
        System.out.println("Before Reverse_3 : "+Arrays.toString(arr));
        for(int i=0,j=1;i<end;i+=2,j+=2){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println("After Reverse_3 : "+Arrays.toString(arr));
    }
}
