package Arrays;

import java.util.Scanner;

//shift all zeros to the front using a single array in-place:
public class ShiftZeros {
    public static void main(String[] args) {
        int[] arr = {89,78,77,0,53,88,0,0 };

        int[] result = shiftZeros(arr);

        for (int i:result
             ) {
            System.out.println(i);
        }
        //System.out.println(result);
    }

    public static int[] shiftZeros(int[] arr)
    {
        int pos = arr.length-1;
        for (int i = arr.length-1; i>=0; i--)
        {
            if(arr[i] != 0) {
                arr[pos] = arr[i];
                pos--;
            }

        }
        while(pos>=0)
        {
            arr[pos] = 0;
            pos--;
        }
        return arr;
    }
}
