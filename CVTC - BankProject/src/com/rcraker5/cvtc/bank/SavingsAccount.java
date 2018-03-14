package com.rcraker5.cvtc.bank;


public class SavingsAccount extends BankAccount {
	
	protected double	interestDrawingBalance;
	protected double	interestPercentage;
	
	
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		interestDrawingBalance = 0.0;
		interestPercentage = 1.0095;
	}
	
	
	@Override
	protected double getMinBalance() {
		return 0.0;
	}
	
	
	@Override
	public boolean acrueInterest() {
		if (balance > interestDrawingBalance) {
			balance *= interestPercentage;
			return true;
		} else {
			return false;
		}
	}
	
	
	public String toString() {
		return super.toString() + "\nInterest %: " + interestPercentage + "\nMinimum Balance for Interest: $" + interestDrawingBalance + "\nAccount Type: Savings";
	}
	
}
