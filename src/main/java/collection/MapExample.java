package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<String,Integer> mapEx = new HashMap<String,Integer>();
        mapEx.put("Azhar", 1);
        mapEx.put("Azhar Jamal", 2);
        mapEx.put("Mohammed Azhar Jamal", 3);
        mapEx.put("Mohammed Azhar Jamal Junior", 4);
        mapEx.put("Ayzal Jamal", 5);

        for (Map.Entry<String,Integer> entry: mapEx.entrySet())
        {
            if(entry.getValue() == 2)
            {
                System.out.println(entry.getKey());
            }
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());

        }
    }
}
