package collection.list;

import java.util.*;

public class ListExample1 {
    public static void main(String[] args) {

        String[] arr = {"Mohammed","Azhar", "Jamal"};

        List<String> listzFromArray = Arrays.asList(arr);
        System.out.println(listzFromArray);

        for (String str:listzFromArray
             ) {
            System.out.println(str);

        }


        List<String> list = new ArrayList<>();
        list.add("Mohammed");
        list.add("Azhar");
        list.add("Jamal");

        System.out.println(list);

        List<String> list1 = new LinkedList<>();
        list1.add("Mohammed");
        list1.add("Azhar");
        list1.add("Jamal");
        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

        list1.addAll(listzFromArray);

        System.out.println(list1);
        System.out.println(list1.containsAll(listzFromArray));

        Iterator<String> itr = list1.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
