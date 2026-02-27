import java.util.Scanner;

//Reverse a String (Without using reverse())
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to the reverse");

        String word = scanner.nextLine();
        reverse(word);

    }
    public static String reverse(String word)
    {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i=word.length()-1;i>=0;i--)
        {
            stringBuilder = stringBuilder.append(word.charAt(i));
        }

        System.out.println(stringBuilder);
        return stringBuilder.toString();
    }
}
