package Day_1.SampleProgram;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseSubstring {
    public static void main(String[] args) {
        String str = "Welcome To This Session";
        String[] arr = str.split("\\s+");
        Queue<String> rev = new LinkedList<String>();
        System.out.println(Arrays.toString(arr));
        for(String val:arr){
            rev.offer(new StringBuilder(val).reverse().toString());
        }
        System.out.println(rev);
    }
}
