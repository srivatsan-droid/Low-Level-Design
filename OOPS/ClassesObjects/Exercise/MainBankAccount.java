package OOPS.ClassesObjects.Exercise;

class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    // Constructor with Parameters
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}

public class MainBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "John Doe");
        account.deposit(1000);
        System.out.println(account.getBalance()); // Should print 1000.0

        boolean success = account.withdraw(500);
        System.out.println(success); // Should print true
        System.out.println(account.getBalance()); // Should print 500.0

        success = account.withdraw(1000);
        System.out.println(success);
    }
}
