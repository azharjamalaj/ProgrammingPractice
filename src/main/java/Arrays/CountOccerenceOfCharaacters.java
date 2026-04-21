package Arrays;

import java.util.HashMap;
import java.util.Map;

public class CountOccerenceOfCharaacters {

    public static void main(String[] args) {
        String str = "aabbbcccca";


    }
    public static void findTheOccurence(String str)
    {

        Map<Character, Integer> seen= new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) != ' ')
            {
                seen.put(str.charAt(i), seen.getOrDefault(str.charAt(i),0)+1);
            }

        }
        int maxCount = 0;
        char maxChar= ' ';

        for (Map.Entry<Character,Integer> entry:seen.entrySet()
             ) {
            if(entry.getValue()>maxCount)
            {
                maxCount=entry.getValue();
                maxChar= entry.getKey();
            }

        }

        System.out.println("Max occurring character : '" + maxChar + "' → " + maxCount + " times");
    }
}
