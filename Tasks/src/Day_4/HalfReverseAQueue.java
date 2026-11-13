package Day_4;

import java.util.LinkedList;
import java.util.Queue;

public class HalfReverseAQueue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        for(int val:arr){
            queue.offer(val);
        }

        for(int i=0;i<n/2;i++){
            int temp = queue.poll();
            queue.offer(temp);
        }
        System.out.println("After Reverse : "+queue);
    }
}
