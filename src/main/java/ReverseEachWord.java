import java.util.Scanner;

//Reverse Each Word (Not Entire String)
//Reverse characters of each word but keep word order same.
public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence of your choice");
        String input = scanner.nextLine();
        System.out.println(reverseOnlyTheWord(input));
    }

    public static String reverseOnlyTheWord(String input)
    {
        StringBuilder reverseWord = new StringBuilder("");
        String[] split = input.split(" ");
        for(int i=0;i<split.length;i++)
        {
            reverseWord = new StringBuilder(reverseWord + reverse(split[i])).append(" ") ;
        }
        return reverseWord.toString();
    }
    public static String reverse(String word)
    {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i=word.length()-1;i>=0;i--)
        {
            stringBuilder = stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }
}
