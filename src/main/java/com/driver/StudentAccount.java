package com.driver;

public class StudentAccount extends BankAccount{

    String  institutionName;

    public StudentAccount(String name, double balance, String  institutionName) {

        super(name);
        this.balance=0;

        this.institutionName=institutionName;
        //minimum balance is 0 by default

    }



}
