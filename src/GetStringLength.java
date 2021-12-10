import java.util.Scanner;

public class GetStringLength {
    public static int stringLength(String input) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string: ");
        input = in.nextLine();
        String inputNew;
        //создаю переменную, где будет хранится наша строка вместе с null значением в конце
        inputNew = input + '\0';
        // '\0'- символ null terminator, в Си подобных языках - пустое значение, также обозначает конец строки в типе данных String
        int length = 0;
        //length - длина строки, также счетчик в теле цикла
        for (int i = 0; inputNew.charAt(i) != '\0'; i++)
        //цикл, в котором я прохожусь по символам (char) строки в поиске конца строки '\0'
        {
            if (input != null) {
                length++;
            } else length = 0;

        }
        System.out.println(length);
        return length;
    }
}

