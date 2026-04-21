package collection;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToCollection {
    public static void main(String[] args) {

        Integer[] arr = {45,65, 76, 75,90};
        convertToList(arr);


    }
    public static void convertToList(Integer[] arr)
    {
        List<Integer> list = Arrays.asList(arr);
        for (int i =0; i<=list.size()-1;i++
             )

            {
        if(list.get(i)==76)
        {
            list.remove(i);
            System.out.println(list.get(i));
        }
        }

    }

}
