package HASHING;

import java.util.* ;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        //inserting
        map.put("India", 100);
        map.put("china", 120);
        map.put("USA", 70);
        // System.out.println(map);
        // map.put("china", 125);
        // System.out.println(map);

        //searching
        // System.out.println(map.containsKey("china"));
        // System.out.println(map.get("india"));

        //iteration
        for(Map.Entry<String,Integer> e : map.entrySet()){
            // System.out.println(e.getKey());
            // System.out.println(e.getValue());
        }

    }
}
