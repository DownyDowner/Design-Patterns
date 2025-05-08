package ChainOfResponsibility;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMDispenser atm = new ATMDispenser();

        System.out.println("=== Welcome to the ATM ===");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Withdraw money");
            System.out.println("2. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Enter amount to withdraw (multiple of 5): ");
                    String input = scanner.nextLine();

                    try {
                        int amount = Integer.parseInt(input);

                        if (amount <= 0) {
                            System.out.println("Please enter a positive amount.");
                        } else if (amount % 5 != 0) {
                            System.out.println("Amount must be a multiple of 5.");
                        } else {
                            atm.dispense(amount);
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                    break;

                case "2":
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option. Please choose 1 or 2.");
            }
        }
    }
}
