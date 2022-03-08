package com.workshop2;

/**
 * This class holds the bank account details of a person.
 */
public class SavingAccount {
    /**
     * Use a static variable annualInterestRate to store the annual interest rate for all account holders.
     * Each object of the class contains a private instance variable
     * savingsBalance indicating the amount the saver currently has on deposit
     */
    private static double annualInterestRate;
    private double savingsBalance;
    private double monthlyInterest;

    /**
     * This parameterized constructor is used to initialize the value of savingsBalance
     * @param balance
     */

    public SavingAccount(double balance) {
        this.savingsBalance = balance;
    }

    /**
     *
     * This static method is used to set the annualInterestRate
     * The interest is divided by 100 to change it to real value.
     * @param interestRate
     */

    public static void modifyInterestRate(double interestRate) {
        annualInterestRate = interestRate / 100;
    }

    /**
     * This method calculates the monthly interest on savings.
     * calculateMonthlyInterest to calculate the monthly interset by multiplying the savingBalance by
     * annualInterestRate divided by 12
     * this interest should be added to savingBalance.
     */

    public void calculateMonthlyInterest() {
        monthlyInterest = savingsBalance * annualInterestRate / 12;
        System.out.println("The monthly interest is: $" + monthlyInterest);
    }

    /**
     *  This method adds the monthly interest to the total savings.
     */

    private void calculateSavings() {
        savingsBalance += monthlyInterest;
    }

    /**
     * This method displays the total savingsBalance
     */

    public void displaySavings() {
        calculateSavings();
        System.out.println("The total balance is : $ " + savingsBalance);
    }

}


