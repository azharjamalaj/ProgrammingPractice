package Reverse;

public class RemoveVowel {
    public static void main(String[] args) {
        String message = "i love java";
        message = message.toLowerCase();
        System.out.println(vowelRemoved(message));
    }
    public static String vowelRemoved(String message)
    {
        char[] charArray = message.toCharArray();
        StringBuilder result = new StringBuilder(" ");
        for (int i=0;i<= charArray.length-1;i++)
        {
            if(charArray[i] == 'a'|| charArray[i] == 'e'|| charArray[i] == 'i'||charArray[i] == 'o'||charArray[i] == 'u')
            {
                charArray[i] = '$';
            }
            result = result.append(charArray[i]);
        }

        return result.toString();
    }
}
