package atm;

public class UserAccount {
    private String userId;
    private String pin;
    private double balance;
    private TransactionHistory transactionHistory;
    
    public UserAccount(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
        this.transactionHistory = new TransactionHistory();
    }
    
    public boolean authenticate(String userId, String pin) {
        return this.userId.equals(userId) && this.pin.equals(pin);
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void updateBalance(double amount) {
        balance += amount;
    }
    
    public TransactionHistory getTransactionHistory() {
        return transactionHistory;
    }
}