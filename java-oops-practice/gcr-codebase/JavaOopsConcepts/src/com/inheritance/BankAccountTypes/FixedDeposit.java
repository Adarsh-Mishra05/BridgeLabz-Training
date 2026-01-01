package com.inheritance.BankAccountTypes;

public class FixedDeposit extends BankAccount {

    private int tenure; // in months

    public FixedDeposit(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " months");
    }
}
