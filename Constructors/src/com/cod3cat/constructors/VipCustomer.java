package com.cod3cat.constructors;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String customerEMail;

    public VipCustomer() {
        this("default Name", 25000, "defaultemail@mybank.com");
    }

    public VipCustomer(String name, String customerEMail) {
        this(name, 25000, customerEMail);
    }

    public VipCustomer(String name, int creditLimit, String customerEMail) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.customerEMail = customerEMail;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEMail() {
        return customerEMail;
    }
}
