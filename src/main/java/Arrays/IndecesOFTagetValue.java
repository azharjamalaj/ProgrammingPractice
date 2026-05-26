package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IndecesOFTagetValue {

    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
        public static void main(String[] args) {
            System.out.println("Start small. Ship something.");
            // Given an array of integers nums and an integer target, return the indices of the two numbers such that they add up to the target.
            //Input: = [1, 3, 2, 3, 4], target = 6
            //Output: [[1, 3], [2, 4]]

            int[] arr = {1, 3, 2, 3, 4};
            List<Integer> list= new ArrayList<>();
            for(int i=0;i < arr.length ;i++)
            {
                list.add(arr[i]);
            }

            Set<Integer> targetList = new HashSet<>();
            for(int i =0; i<list.size();i++)
            {
                for(int j=i+1; j<list.size(); j++)
                {int countTarget = list.get(i) + list.get(j);
                    if(countTarget == 6 )
                    {
                        targetList.add(i);
                        targetList.add(j);
                    }
                }
            }
            System.out.println(targetList);
        }
}

//// Given a string, find the length of the longest substring without repeating characters.
////Input:  "abcabcbb"
////Output: 3