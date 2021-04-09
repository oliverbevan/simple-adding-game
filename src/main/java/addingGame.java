import java.util.Random;
import java.util.Scanner;

public class addingGame {
    public static void main(String[] args) {
        Random random = new Random();

        String input = "";
        int result = 0;

        int number1 = random.nextInt(100);
        int number2 = random.nextInt(100);

        System.out.println("Add Up \n" + number1 + "\n" + number2);

        int answer = number1 + number2;

        StringBuilder sb = new StringBuilder("Enter value: ");
        Scanner scanner = new Scanner(System.in);

        while (input.isEmpty()) {
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
}
