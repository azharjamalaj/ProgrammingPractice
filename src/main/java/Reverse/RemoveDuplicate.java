package Reverse;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,4};

        Set<Integer> uniqueList = new HashSet<>();
        for (int i=0;i<arr.length;i++)
        {
            uniqueList.add(arr[i]);
        }

        System.out.println(uniqueList);
        }
    }

