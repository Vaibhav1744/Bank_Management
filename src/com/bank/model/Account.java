package com.bank.model;

import com.bank.constants.AccountType;
import com.bank.util.IDGenerator;  
public class Account {
    protected User user;
    protected double balance;
    protected AccountType accountType;
    protected String accountNumber;
    IDGenerator idGenerator = new IDGenerator();

    public Account(User user, double balance, AccountType accountType) {
        this.user = user;
        this.balance = balance;
        this.accountType = accountType;
        this.accountNumber = idGenerator.generateUserID();
    }
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
        System.out.println("Deposited Amount: " + amount);
        System.out.println("Updated Balance: " + balance);
    }
    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
