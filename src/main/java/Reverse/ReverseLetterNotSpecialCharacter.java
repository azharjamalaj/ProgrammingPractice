package Reverse;//Reverse Only Letters (Ignore Special Characters)
import java.util.Scanner;

public class ReverseLetterNotSpecialCharacter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word with special character");

        String word = scanner.nextLine();
        StringBuilder builder = new StringBuilder("");

        char[] arr = word.toCharArray();
        int left = 0, right = word.length() - 1;

        while (left < right)
            if (!Character.isLetter(word.charAt(left)))
                left++;
            else if (!Character.isLetter(word.charAt(right)))
                right--;
            else {
                char temp = arr[left];
                arr[left] = arr[right];

                arr[right] = temp;
                left++;
                right--;
            }
        System.out.println(new String(arr));
    }
}