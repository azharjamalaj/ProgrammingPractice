package Reverse;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurence {
    public static void main(String[] args) {
        String message = "i love java mar java mit java loot java";
        occurenceChar(message);
        occurenceWord(message);
    }

    public static void occurenceChar(String message)
    {
        Map<Character, Integer> seen = new HashMap<>();
        for(int i=0; i<= message.length()-1; i++)
        {
            if (message.charAt(i) != ' ')
            {
                seen.put(message.charAt(i), seen.getOrDefault(message.charAt(i),0)+1);
            }
        }

        char maxChar = ' ';
        int maxCount= 0;
        for (Map.Entry<Character,Integer> entry: seen.entrySet()
             ) {
            if(entry.getValue() > maxCount)
            {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
            
        }

        System.out.println("Max occurring character : '" + maxChar + "' → " + maxCount + " times");
    }

    public static void occurenceWord(String message)
    {
        Map<String, Integer> maxSeen = new HashMap<>();
        String[] arr = message.split(" ");

        for (int i=0;i<= arr.length-1; i++)
        {
            if(arr[i]!= " ")
            {
            maxSeen.put(arr[i], maxSeen.getOrDefault(arr[i],0)+1);

            }
        }

        String maxWord = "";
        int maxCount =0;

        for(Map.Entry<String,Integer> entry: maxSeen.entrySet())

            if(entry.getValue()> maxCount)
            {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        System.out.println("Maximum word is " + maxWord + "Max count is " + maxCount);
    }

}
