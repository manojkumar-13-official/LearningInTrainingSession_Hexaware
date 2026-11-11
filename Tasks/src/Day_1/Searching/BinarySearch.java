package Day_1.Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the "+n+" elements : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int idx1 = binarySearch(n,arr,k);
        if(idx1!=-1){
            System.out.printf("The element present in %d position",idx1);
        }else{
            System.out.println("The element not present");
        }
    }
    private static int binarySearch(int n,int[] arr,int k){
        int l = 0, r = n-1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid] < k){
                l = mid+1;
            }else{
                r = mid - 1;
            }
        }
        return -1;
    }
}
