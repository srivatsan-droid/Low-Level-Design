package com.SystemDesign.Encapsulation;

public class BankAccountPractice {
    private String accountHolder;
    private double balance;

    public BankAccountPractice(String accountHolder,double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Deposit Amount must be Positive");
        }
        balance += amount;
    }
    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount > balance) {
            throw new IllegalArgumentException("Insufficient Funds");
        }
        balance -= amount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }
    public void display(String accountHolderName,double balance) {
        System.out.println("The Name of the Person is : " + accountHolderName + " Balance is :  " + balance);
    }
    public static void main(String[] args) {
        BankAccountPractice bankObj = new BankAccountPractice("Srivatsan",122.222);
        String name  = bankObj.getAccountHolder();
        double balance = bankObj.getBalance();
        bankObj.withdraw(120.2);
        bankObj.display(name,balance);
    }
}
