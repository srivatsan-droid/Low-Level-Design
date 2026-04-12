package OOPS.ClassesObjects.Exercise;

class Bank_Account {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public Bank_Account(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public boolean withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double getBalance(double balance) {
        return balance;
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank_Account account = new Bank_Account("123456", "John Doe", 12000);
        account.deposit(1000);
        System.out.println(account.getBalance(1000.00)); // Should print 1000.0

        boolean success = account.withdraw(500);
        System.out.println(success); // Should print true
        System.out.println(account.getBalance(100.00)); // Should print 500.0

        success = account.withdraw(1000);
        System.out.println(success);
    }
}
