package com.rcraker5.cvtc.bank;


public class BusinessChecking extends BankAccount {
	
	protected double	interestDrawingBalance;
	protected double	interestPercentage;
	
	
	public BusinessChecking(String name, double balance) {
		super(name, balance);
		interestDrawingBalance = 500.00;
		interestPercentage = 1.0125;
	}
	
	
	@Override
	protected double getMinBalance() {
		return 5.00;
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
	
	
	public double getInterestDrawingBalance() {
		return interestDrawingBalance;
	}
	
	
	public String toString() {
		return super.toString() + "\nInterest %: " + interestPercentage + "\nMinimum Balance for Interest: $" + interestDrawingBalance + "\nAccount Type: Business Checking";
	}
	
}
