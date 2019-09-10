package com.cod3cat.constructors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account bobsAccount = new Account();
        Account shaunsAccount = new Account(124,0,"Shaun", 1233456123, "shaun@mybank.com");
        VipCustomer johnsAccount = new VipCustomer();
        VipCustomer ronsAccount = new VipCustomer("Ron", "ron@mybank.com");
        VipCustomer shellyAccount = new VipCustomer("Shelly",50000, "shelly@mybank.com");

        bobsAccount.setCustomerName("John");
        bobsAccount.setAccountNumber(123);
        bobsAccount.setAccountBalance(100);
        bobsAccount.setCustomerEmail("john@mybank.com");
        bobsAccount.setCustomerPhoneNumber(1234567890);

        bobsAccount.getCustomerName();
        bobsAccount.getCustomerEmail();
        bobsAccount.getCustomerPhoneNumber();
        bobsAccount.getAccountNumber();
        bobsAccount.getAccountBalance();

        bobsAccount.deposit(200);
        bobsAccount.withdraw(300.5);
        bobsAccount.withdraw(100);

        shaunsAccount.withdraw(100);
        shaunsAccount.deposit(2500);
        shaunsAccount.withdraw(123.98);
        shaunsAccount.getAccountBalance();

        johnsAccount.getCreditLimit();
        johnsAccount.getCustomerEMail();
        johnsAccount.getName();

        ronsAccount.getName();
        ronsAccount.getCustomerEMail();
        ronsAccount.getCreditLimit();

        shellyAccount.getCreditLimit();
        shellyAccount.getCustomerEMail();
        shellyAccount.getName();


    }
}
