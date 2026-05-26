package TWOFIVEProgram;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence {
    public static void main(String[] args) {

        String input = "My name is azhar jamal";
        HashMap<Character, Integer> returnOcc = ReturnOccurence(input);
        findDuplicate(returnOcc);

    }

    public static HashMap<Character, Integer> ReturnOccurence(String input)
    {
        Map<Character, Integer> seen = new HashMap<>();

        for(char ch: input.toCharArray()) {
            if (seen.containsKey(ch)) {
                seen.put(ch, seen.get(ch) + 1);
            }
            else
            {
                seen.put(ch,1);
            }
        }
        System.out.println(seen);

        return (HashMap<Character, Integer>) seen;
    }

    public static void findDuplicate(HashMap<Character, Integer> returnOcc)
    {
        for(Map.Entry<Character,Integer> entry: returnOcc.entrySet())
        {
            if(entry.getValue()>=2)
            {
                System.out.println(entry.getKey() + " appears more than :" + entry.getValue());
            }
        }
    }
}
