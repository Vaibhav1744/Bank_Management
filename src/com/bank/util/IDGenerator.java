package com.bank.util;

import java.time.LocalDate;
import java.util.UUID;

import com.bank.constants.AccountType;

public class IDGenerator {
    public String generateAccountNumber(AccountType accountType)
    {
        String accountNumber = "ACC";
        int counter = 1;
        if(accountType==AccountType.SAVINGS_ACCOUNT)
        {
            accountNumber += "_sav_"+LocalDate.now().getYear()+"_"+counter++;
        }
        else if(accountType==AccountType.CURRENT_ACCOUNT)
        {
            accountNumber += "_cur_"+LocalDate.now().getYear()+"_"+counter++;
        }
        return accountNumber;
    }
    public String generateUserID()
    {
        return UUID.randomUUID().toString();
    }
}
