package Reverse;

import java.util.Scanner;

public class ReversePalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word ");

        String input = scanner.nextLine();
        System.out.println(palindrome(input));

    }

    public static boolean palindrome(String input)
    {
        int left=0, right = input.length()-1;

        while(left<right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
