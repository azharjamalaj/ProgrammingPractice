package Arrays;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "selenium";
        Map<Character, Integer> seen = new HashMap<>();
        for(char ch: str.toCharArray())
        {
            if(seen.containsKey(ch)){
                seen.put(ch, seen.get(ch)+1);
            }
            else
            {
                seen.put(ch,1);
            }
        }

        int count = 0;
        char CharOccurence;
        System.out.println(seen);
        for (Map.Entry<Character, Integer> entry: seen.entrySet() )
            if(entry.getValue()>1)
            {
                count = entry.getValue();
                CharOccurence = entry.getKey();
                System.out.println(count +":" + CharOccurence);
            }
    }
}
