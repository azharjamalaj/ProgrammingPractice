package Reverse;
//Reverse Word Order (Not Characters)
import java.util.Scanner;

public class ReverseWordOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence  = scanner.nextLine();

        String[] split = sentence.split(" ");
        StringBuilder reverseOrder = new StringBuilder("");
        for(int i=split.length-1;i>=0;i--)
        {
            reverseOrder = new StringBuilder(reverseOrder + split[i]).append(" ");
        }
        System.out.println( reverseOrder);
    }
}
