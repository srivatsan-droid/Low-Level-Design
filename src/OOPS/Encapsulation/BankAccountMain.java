package OOPS.Encapsulation;

class BankAccount {
    private final String accountNumber;
    private final String ownerName;
    private double balance;
    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public boolean deposit(double amount) {
        if(amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if(amount <= 0 || balance < amount) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getSummary() {
        return String.format(java.util.Locale.US,
                "%s (%s) | Balance: $%.2f", ownerName, accountNumber, balance);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        String accountNumber = "ACC-123";
        String ownerName = "John Doe";
        double amount = 500.00;
        BankAccount obj = new BankAccount(accountNumber, ownerName);
        boolean param_1 = obj.deposit(amount);
        boolean param_2 = obj.withdraw(0);
        double param_3 = obj.getBalance();
        String param_4 = obj.getSummary();
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}
