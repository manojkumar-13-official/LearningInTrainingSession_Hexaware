package Day_1.Searching;

import java.util.Scanner;

public class LinearSearch {
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
        int idx = linearSearch(n,arr,k);
        if(idx!=-1){
            System.out.printf("The element present in %d position",idx);
        }else{
            System.out.println("The element not present");
        }
    }
    private static int linearSearch(int n,int[] arr,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
