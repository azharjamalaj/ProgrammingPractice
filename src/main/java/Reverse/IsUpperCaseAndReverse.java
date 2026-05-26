package Reverse;

public class IsUpperCaseAndReverse {

    public static void main(String[] args) {
        String input = "Automation TesTiNg";
        String storeUpperCase = findUpperCaseCharacter(input);
        System.out.println(storeUpperCase);
        String reversSting = reverseString(storeUpperCase);
        System.out.println(reversSting);
    }

    public static String findUpperCaseCharacter(String input)
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=0;i<input.length();i++)
        {
            if (Character.isUpperCase(input.charAt(i)))
            {
                stringBuilder = stringBuilder.append(input.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static String reverseString(String reverseNow)
    {
        StringBuilder stringBuilder1 = new StringBuilder();

        for (int i=reverseNow.length()-1; i>=0; i--)
        {
            stringBuilder1 = stringBuilder1.append(reverseNow.charAt(i));
        }
        return stringBuilder1.toString();
    }
}
