package collection.list;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class FindDuplicateEntry {

    public static void main(String[] args) {
        String[] arr = {"Azhar", "Mazhar", "Jamal", "Azhar", "Jamal"};
        List<String> list = Arrays.asList(arr);

        int count =1;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i=0;i<list.size();i++)
        {
            if(i + 1 < list.size() && list.get(i)== list.get(i+1))
                {
                    stringBuilder.append(list.get(i)+count);
                    count++;
                }
            else
            {

            }
        }


    }
}
