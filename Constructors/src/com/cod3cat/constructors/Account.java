package com.cod3cat.constructors;

public class Account {
    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private int customerPhoneNumber;
    private String customerEmail;

    //Empty constructor
    public Account() {
        System.out.println("Empty constructor called");
    }

    public Account(int accountNumber, double accountBalance, String customerName, int customerPhoneNumber, String customerEmail) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
        this.customerEmail = customerEmail;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double addMoney){
        this.accountBalance += addMoney;
        System.out.println("Added amount: " +addMoney + " New Balance: " + getAccountBalance());
    }

    public void withdraw(double removeMoney){
        if(getAccountBalance() - removeMoney >= 0.0){
            this.accountBalance -= removeMoney;
            System.out.println("New Balance: " + getAccountBalance());
        }else{
            System.out.println("Insufficient accountBalance");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }
}
