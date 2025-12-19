package com.bank.model;

import com.bank.util.IDGenerator;

public class User {
    private String email;
    private String name;
    private String mobileNumber;
    private String address;
    IDGenerator idGenerator = new IDGenerator();


    public User(String name, String mobileNumber, String address, String email) {
        this.email = email;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
    }   

    public String getName() {
        return name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
