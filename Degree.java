import java.io.IOException;
import java.lang.Exception;

public class Degree extends Main {
    public static String degree(String input) throws Exception,IOException{
        String[] numeral = {"0","1","2","3","4","5","6","7","8","9"};

        String[] data = input.split("/");

        int index = data[0].length()/Integer.parseInt(data[1]);
        int numeralsecond = -1;
        for (int i = 0; i < numeral.length; i++)
        {
            if (data[1].contains(numeral[i]))
            {
                numeralsecond = i;
                break;
            }
        }
        if (numeralsecond == -1 ){
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.err.println("Нельзя делить строку на строку!");
            }
        }
        if (numeralsecond == 0 ){
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.err.println("Нельзя делить на 0!");
            }
        }


        String result = data[0].substring(0,index);

        return '"'+result+'"';

    }
}
