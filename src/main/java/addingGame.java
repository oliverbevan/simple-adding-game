import com.sun.tools.javac.util.StringUtils;

import java.util.Random;
import java.util.Scanner;

public class addingGame {
    public static void main(String[] args) {
        Random random = new Random();

        String input = "";
        int result = 0;

        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);

        int answer = number1 + number2;

        StringBuilder sb = new StringBuilder("Enter value: ");
        Scanner scanner = new Scanner(System.in);

        while (input.isEmpty()||!isNumeric(input)) {
            System.out.println("Add Up \n" + number1 + "\n" + number2);
            System.out.print("Enter value: ");
            input = scanner.nextLine();
        }

        result = Integer.parseInt(input) + result;

        if (result == answer){
            System.out.println("Good job!!");
        } else {
            System.out.println("Bad job!");
        }
    }

    public static boolean isNumeric(String string) {
        int intValue;

        System.out.println(String.format("Parsing string: \"%s\"", string));

        if(string == null || string.equals("")) {
            System.out.println("String cannot be parsed, it is null or empty.");
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
}
