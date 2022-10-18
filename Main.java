import java.io.IOException;
import java.lang.Exception;

public class Main {
    public static String calc(String input) throws Exception {

        String[] numeral = {"0","1","2","3","4","5","6","7","8","9"};
        String[] operation = {"+", "-", "/", "*"};
        String[] separator = {"\\+", "-", "/", "\\*"};


        String result = input.replace("\"","");
        int index = result.length();
        if(index>25){
            try {
                throw new IOException();
            } catch (IOException e) {
                System.err.println("Длинна одной или обоих введенных строк более 10 символов!");

            }
        }

        int operationValue = -1;
        for (int i = 0; i < operation.length; i++)
        {
            if (input.contains(operation[i]))
            {
                operationValue = i;
                break;
            }
        }

        if (operationValue == -1) {// Проверка на операнд
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Введенное выражение не содержит операнда(+,-,*,/)");
            }

        }
        String[] data = result.split(separator[operationValue]);
        int numeralfirst = -1;
        for (int y = 0; y < numeral.length; y++)
        {
            if (data[0].contains(numeral[y]))
            {
                numeralfirst = y;
                break;
            }
        }
        if (numeralfirst > 0) {// Проверка на число в первой строке
            try {
                throw new IOException();
            } catch (IOException e) {
                System.err.println("Первая строка не может содержать число!");
            }

        }

        return switch (operation[operationValue]) {// Передаем в метод согласно операнду
            case "+" -> {
                yield Addition.addition(result);
            }
            case "-" -> {
                yield Substraction.substraction(result);
            }
            case "*" -> {
                yield Multyplication.multyply(result);
            }
            default-> {
                yield Degree.degree(result);
            }
        };
    }
}