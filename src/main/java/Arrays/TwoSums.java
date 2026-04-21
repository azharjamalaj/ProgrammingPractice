package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {

        int[] arr={2,3,5,6};
        int target = 9;
        int[] result=twoSumsMethod(arr,target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

    }

    public static int[] twoSumsMethod(int[] arr, int target) {

        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }

            seen.put(arr[i], i);
        }
        return  new int[]{};
    }
}







