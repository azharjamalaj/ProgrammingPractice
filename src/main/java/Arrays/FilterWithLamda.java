package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWithLamda {
    public static void main(String[] args) {

        List<String> listName = new ArrayList<>();
        listName.add("Manna");
        listName.add("Nadia");
        listName.add("Ayzal");
        listName.add("Manish");
        listName.add("Andrew");
        listName.add("Azhar");

        List<String> filtername = (List<String>) listName.stream()
                .filter(name-> name.endsWith("al") || name.startsWith("Ay"))
                .collect(Collectors.toList());

        for (String name:filtername
             )
            System.out.println(name); {

        }
    }
}
