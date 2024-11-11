package atm;

import java.util.Scanner;

public class ATMOperations {
    
    public static void withdraw(UserAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        
        if (amount <= account.getBalance() && amount > 0) {
            account.updateBalance(-amount);
            account.getTransactionHistory().addTransaction("Withdraw: $" + amount);
            System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    
    public static void deposit(UserAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        
        if (amount > 0) {
            account.updateBalance(amount);
            account.getTransactionHistory().addTransaction("Deposit: $" + amount);
            System.out.println("Deposit successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    public static void transfer(UserAccount account) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to transfer: ");
        double amount = scanner.nextDouble();
        
        System.out.print("Enter recipient account number: ");
        String recipientAccount = scanner.next();
        
        if (amount <= account.getBalance() && amount > 0) {
            account.updateBalance(-amount);
            account.getTransactionHistory().addTransaction("Transferred: $" + amount + " to " + recipientAccount);
            System.out.println("Transfer successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    
    public static void showBalance(UserAccount account) {
        System.out.println("Current Balance: $" + account.getBalance());
    }
}