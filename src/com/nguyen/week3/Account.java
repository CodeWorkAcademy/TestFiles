package com.nguyen.week3;

public class Account {

    private String accountNumber;
    private String username;
    private double balance;
    private int pinNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public void deposit(int amount) {
        balance+=amount;
    }

    public void withdraw(int amount) {
        balance-=amount;
    }

}
