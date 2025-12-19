package com.bank.model;
import com.bank.constants.AccountType;
public class CurrentAccount extends Account{
    public static final double MAX_BALANCE = 1000000000.0;
    public CurrentAccount(User user, double balance) {
        super(user, balance, AccountType.CURRENT_ACCOUNT);
    }
    public double getMaxBalance() {
        return MAX_BALANCE;
    }
  
}
