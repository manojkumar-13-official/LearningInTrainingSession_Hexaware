package Day_3.Two_Pointer;

import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int st = 0, end = n-1;
        while(st < end){
            int sum = arr[st] + arr[end];
            if(sum==k){
                System.out.printf("Pair_Sum ; %d -- %d\n",arr[st],arr[end]);
                st++;
                end--;
            }else if(sum > k){
                end--;
            }else{
                st++;
            }
        }
    }
}
