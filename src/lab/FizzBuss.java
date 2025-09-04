package lab;

import java.util.Scanner;

public class FizzBuss {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String number = scanner.nextLine();
        System.out.println("You entered: " + number);

        try {
            int value = Integer.parseInt(number);
            if (isNotNegative(value)) {
                throw new IllegalArgumentException("Number is negative");
            }
            calcFizzBuzz(value);

        } catch (NumberFormatException e) {
            System.out.println("That is not a valid integer");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught a negative value error");
        }
        scanner.close();
    }

    private static void calcFizzBuzz(int number) {
        if ((number % 5 == 0) && (number % 3 == 0)) {
            System.out.print("FizzBuzz");
            return;
        }
        if (number % 5 == 0) {
            System.out.print("Buzz");
            return;
        }
        if (number % 3 == 0) {
            System.out.print("Fizz");
            return;
        }
        else {
            System.out.print(number);
        }
    }

    private static boolean isNotNegative(int number) {
        return number <= 0;
    }
}
