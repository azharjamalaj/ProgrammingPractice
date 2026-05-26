package TWOFIVEProgram;

import java.util.*;

public class RemoveDuplicate {

        public static void main(String[] args) {
            System.out.println("Start small. Ship something.");
            String input= "my name is azhar";

            HashMap<Character, Integer> occurence= Occurence(input);
            findDuplicate(occurence);
            removeDuplicate(input);

        }

        public static HashMap<Character, Integer> Occurence(String input)
        {

            Map<Character, Integer> seen = new HashMap<>();
            for(char ch: input.toCharArray())
            {
                if(seen.containsKey(ch))
                {
                    seen.put(ch, seen.get(ch)+1);
                }
                else
                {
                    seen.put(ch,1);
                }
            }
            System.out.println(seen);
            return (HashMap<Character, Integer>) seen;
        }

        public static void findDuplicate(HashMap<Character, Integer> occurence)
        {
            for(Map.Entry<Character,Integer> entry: occurence.entrySet() )
            {
                if(entry.getValue()>=2)
                {
                    System.out.println("The value :" + entry.getKey()+ " appear duplicate with "+ entry.getValue() + "appeared in the string");
                }
                else
                {
                    System.out.println("The value is unique :" + entry.getKey()+ " appear only "+ entry.getValue() );
                }


            }
        }

        public static void removeDuplicate(String input)
        {
            Set<Character> uniqueCharacter = new HashSet<>();
            Set<Character> uniqueUsingLinkedSet = new LinkedHashSet<>();
            for(char ch: input.toCharArray())
            {
                uniqueCharacter.add(ch);
                uniqueUsingLinkedSet.add(ch);
            }
            System.out.println(uniqueCharacter);
            System.out.println(uniqueUsingLinkedSet);
        }
    }

