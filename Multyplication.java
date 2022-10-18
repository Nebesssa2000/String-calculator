public class Multyplication extends Main{
    public static String multyply(String input) {

        String[] data = input.split("\\*");
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
