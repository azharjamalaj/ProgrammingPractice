package String;

public class CountSum {
    public static void main(String[] args) {

        String str = "abc123def45gh6i7";
        StringBuilder num = new StringBuilder();
        int total = 0;
//        for(char ch:str.toCharArray())
//        {
//            if(Character.isDigit(ch))
//            {
//                num.append(ch);
//            }
//            else {
//                if(num.length()>0)
//                {
//                    total += Integer.parseInt(num.toString());
//                    num.setLength(0);
//                }
//            }
//        }

       /* if(num.length()>0)
        {
            total += Integer.parseInt(num.toString());
        }
        System.out.println(total);*/

        for(char ch: str.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                num.append(ch);
            }
            else
            {
                if(num.length()>0)
                {
                    total += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }
        if(num.length()>0)
        {
            total += Integer.parseInt(num.toString());
        }
        System.out.println(total );
    }
}
