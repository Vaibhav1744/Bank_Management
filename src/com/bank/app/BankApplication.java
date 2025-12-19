package com.bank.app;

import java.util.Scanner;

import com.bank.model.Account;
import com.bank.model.CurrentAccount;
import com.bank.model.SavingsAccount;
import com.bank.model.User;

public class BankApplication {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Management System");

       Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your mobile number: ");
        String mobileNumber = sc.nextLine();
        System.out.print("Enter your address: ");
        String address = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        User user = new User(name, mobileNumber, address, email);

        System.out.println("Select Account Type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");
        int choice = sc.nextInt();

        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account account;

        if (choice == 1) {
            account = new SavingsAccount(user, balance);
        } 
        else if (choice == 2) {
            account = new CurrentAccount(user, balance);
        } 
        else {
            System.out.println("Invalid account type selected.");
            sc.close();
            return;
        }

        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();

        account.deposit(depositAmount);

        sc.close();

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Balance: " + account.getBalance());
        System.out.println("Account Holder: " + user.getName());
        System.out.println("Account Holder Email: " + user.getEmail());
        System.out.println("Account Holder Mobile Number: " + user.getMobileNumber());
        System.out.println("Account Holder Address: " + user.getAddress());

    }
}
