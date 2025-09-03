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
        System.out.print("Enter amount: ");
        userInput.nextLine();

        System.out.print("Enter rate: ");
        userInput.nextLine();

        System.out.print("Enter duration period: ");
        userInput.nextLine();

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
