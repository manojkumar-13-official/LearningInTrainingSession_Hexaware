package Day_4;

import java.util.HashMap;

public class OccurrencesOfBook {
    public static void main(String[] args) {
        String[] books={"dsa","os","java","java","maths","os","sql","sql"};
        HashMap<String,Integer> map = new HashMap<>();
        for(String s:books){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String val:map.keySet()){
            System.out.println(val+"--"+map.get(val));
        }
    }
}
