package com.inheritance.BankAccountTypes;

public class Main {
	public static void main(String[] args) {

        SavingAccount sa = new SavingAccount("SA101", 50000, 4.5);
        CheckAccount ca = new CheckAccount("CA202", 30000, 10000);
        FixedDeposit fd = new FixedDeposit("FD303", 100000, 24);

        sa.displayAccountType();
        System.out.println();

        ca.displayAccountType();
        System.out.println();

        fd.displayAccountType();
    }
		
}
   