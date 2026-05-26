package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Azhar",1);
        map.put("Jamal",2);
        map.put("Mohammed",0);

        for (Map.Entry<String, Integer> seen: map.entrySet()
             ) {
            System.out.println(seen.getKey()+":" +seen.getValue());
        }
    }
}

