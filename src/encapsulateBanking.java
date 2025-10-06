class BankAccount {
    private double balance;
    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positve");
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positve");
        }
        if(amount > 0) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance; // Controlled access
    }
}
public class encapsulateBanking {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount();
        obj.deposit(1222);
        obj.withdraw(1000);
        obj.getBalance();
    }
}
