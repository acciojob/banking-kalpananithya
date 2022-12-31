package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;


    public BankAccount(String name, double balance, double minBalance) {

    }

    public String generateAccountNumber(int digits, int sum) throws Exception {


        int dig = 1;
        int s = 0;

        while (digits > 0)
        {
            dig *= 10;
            digits /= 10;

        }


        for (int i = 0; i < dig; i++) {

            int last = (int) (System.currentTimeMilliseconds % dig);

            while (last > 0) {

                last = last % 10;
                s += last;
                last /= 10;

            }


        }
        if (s == sum)
            return ((String) last);

        try {

            if (s == 0)
                AccnoException();

        } catch (Throwable e) {


            System.out.println("Account number cannot be generated "
                    + e.toString());
        }

        //Each digit of an account number can lie between 0 and 9 (both inclusive)
        //Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        //If it is not possible, throw "Account Number can not be generated" exception




    public void deposit(double amount) {


        this.balance+=amount;
        //add amount to balance

    }

    public void withdraw(double amount) throws Exception {



           double bal=this.balance-amount;

           try{
               if(bal<0)

                AccnoException();

        } catch (Throwable e) {


            System.out.println("Insufficient Balance"
                    + e.toString());
        }








        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance

    }
}

