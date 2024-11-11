package atm;

import java.util.Scanner;

public class ATMMenu {
    
    public static void displayMenu(UserAccount account) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        
        while (!quit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    account.getTransactionHistory().showHistory();
                    break;
                case 2:
                    ATMOperations.withdraw(account);
                    break;
                case 3:
                    ATMOperations.deposit(account);
                    break;
                case 4:
                    ATMOperations.transfer(account);
                    break;
                case 5:
                    quit = true;
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        
        scanner.close();
    }
}