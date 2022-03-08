package com.workshop2;


/**
 *  This class is used to test the SavingsAccount class
 */
public class SavingAccountMain {
    public static void main(String[] args) {
        SavingAccount saver1 = new SavingAccount(2000);
        SavingAccount saver2 = new SavingAccount(3000);

        System.out.println("...........for saver 1".........);
        SavingAccount.modifyInterestRate(4.0);
        saver1.calculateMonthlyInterest();
        saver1.displaySavings();
        saver1.calculateMonthlyInterest();
        saver1.displaySavings();

        System.out.println("...........for saver 2...........");
        SavingAccount.modifyInterestRate(5.0);
        saver2.calculateMonthlyInterest();
        saver2.displaySavings();
        saver2.calculateMonthlyInterest();
        saver2.displaySavings();
    }
}
