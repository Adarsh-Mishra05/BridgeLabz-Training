package com.Week2.LoanBuddy;

public interface IApprovable {
	boolean approveLoan(Applicant applicant);
	double calculateEMI();
}
