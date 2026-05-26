package TWOFIVEProgram;

public class ReverseNumber {
    public static void main(String[] args) {

        int num = 12345;
        int result = 0;
        int sum = 0;

        while(num!=0)
        {
            int digit = num % 10 ;
            result = result *10 +digit;
            num= num/10;
            sum = sum+digit;

        }
        System.out.println(result);
        System.out.println(sum);
    }
}
