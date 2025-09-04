package lab;
import java.util.Scanner;

/**
 * principal
 * rate
 * time
 * mortgage value
 */

public class Mortgage {
    public static void main(String...args) {
        // adding user inputs
        Scanner userInput = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            String userPrincipal = userInput.nextLine();
            int principal = Integer.parseInt(userPrincipal);

            System.out.print("Enter rate: ");
            double rate = Double.parseDouble(userInput.nextLine());

            System.out.print("Enter duration period: ");
            byte duration = Byte.parseByte(userInput.nextLine());

            double mortgageAmount = calcMortgage(principal, rate, duration);
            System.out.println("mortgage amount: " + mortgageAmount);

        } catch (NumberFormatException e) {
            System.out.println("An error occurred. You have to enter a number");
        }

        userInput.close();

//        double mortgageAmount = calcMortgage(100000, 4.2, (byte)30);
//        System.out.println("mortgage amount: " + mortgageAmount);
    }

    private static double calcMortgage(int principal, double rate, byte time) {
        double monthlyRate = rate / 100 / 12;
        int totalPayments = time * 12;
        double amount = principal * (monthlyRate * Math.pow(1 + monthlyRate, totalPayments)) / (Math.pow(1 + monthlyRate, totalPayments) - 1);

        return amount;
    }
}
