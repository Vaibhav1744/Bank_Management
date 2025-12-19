package com.bank.model;

import com.bank.constants.AccountType;

public class SavingsAccount extends Account{
    public static final double MIN_BALANCE = 100.0;
    public SavingsAccount(User user, double balance) {
        super(user, balance, AccountType.SAVINGS_ACCOUNT);
    }
    public double getMinBalance() {
        return MIN_BALANCE;
    }
}
