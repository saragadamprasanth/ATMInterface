package atm;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the ATM");
        
        // User ID and PIN verification
        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        
        System.out.print("Enter PIN: ");
        String userPin = scanner.nextLine();
        
        // Create a new User Account (for demo purposes, using hard-coded credentials)
        UserAccount account = new UserAccount("user123", "1234", 5000.00);
        
        if (account.authenticate(userId, userPin)) {
            System.out.println("Login successful!");
            ATMMenu.displayMenu(account);
        } else {
            System.out.println("Invalid credentials. Exiting.");
        }
        
        scanner.close();
    }
}