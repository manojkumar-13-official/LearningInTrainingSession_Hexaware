package Day_1.SampleProgram;

import java.util.LinkedList;
import java.util.Queue;

public class Task1 {
    static int capacity = 4;
    static Queue<String> enrolled = new LinkedList<>();
    public static void main(String[] args) {
        String[] names = {"Anu","Ravi","Meena","John","Sara"};
        for(String name:names){
            enrolled.offer(name);
        }
        System.out.println("Before Drop : "+enrolled);
        drop("Ravi");
        System.out.println("After Drop : "+enrolled);
        System.out.println("Seat 1 reserved for "+enrolled.peek());
    }

    private static void drop(String name) {
        if(enrolled.contains(name)){
            enrolled.remove(name);
        }
    }

    private static String enroll(String name) {
        if(enrolled.size() < capacity){
            enrolled.offer(name);
            return "Enrolled";
        }
        return "Batch Full";
    }

}
