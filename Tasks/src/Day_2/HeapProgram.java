package Day_2;

import java.util.HashMap;
import java.util.Map;

public class HeapProgram {
    public static void main(String[] args) {
        String str = "HELLOWORLD";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char key : map.keySet()) {
            System.out.println(key + "--" + map.get(key));
        }
    }
}
