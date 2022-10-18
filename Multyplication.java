public class Multyplication extends Main{
    public static String multyply(String input) {
        String[] numeral = {"0","1","2","3","4","5","6","7","8","9"};


        String[] data = input.split("\\*");

        int numeralsecond = -1;
        for (int i = 0; i < numeral.length; i++)
        {
            if (data[1].contains(numeral[i]))
            {
                numeralsecond = i;
                break;
            }
        }
        if (numeralsecond == -1 ) {
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.err.println("Нельзя умножать строку на строку!");
            }
        }
        int a = Integer.parseInt(data[1]);
        String result = data[0].repeat(a);
        int index = result.length();


            if(index<40) {
                result = '"'+result+'"';
            }
            else {
                String result1 = result.substring(0,40);
                result = '"' + result1 + "..." + '"';
            }
            return result;

        }
    }
