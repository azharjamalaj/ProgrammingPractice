//Reverse Only Letters (Ignore Special Characters)
import java.util.Scanner;

public class ReverseLetterNotSpecialCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word with special character");

        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder("");
        for(int i=0; i<=word.length()-1;i++)
            if(Character.isLetterOrDigit(word.charAt(i))) {
                builder = builder.append(word.charAt(i));
            }
        System.out.println(builder);
    }

}
