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

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
