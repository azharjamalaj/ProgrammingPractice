package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TWoSums2 {
    public static void main(String[] args) {
        int[] arry= {2,4,6,7,9};
        int target  = 15;
        int[] result = twosumsMethod(arry,target);
        System.out.println(result[0]+" And "+ result[1]);

     }

    private static int[] twosumsMethod(int[] arry, int target) {
        Map<Integer,Integer> seen = new HashMap<>();

        for (int i=0;i<arry.length;i++)
        {
            int complement = target- arry[i];
            if(seen.containsKey(complement))
            {
                return new int[] {seen.get(complement),i};
            }

            seen.put(arry[i],i);
        }

        return new int[]{};
    }
}
