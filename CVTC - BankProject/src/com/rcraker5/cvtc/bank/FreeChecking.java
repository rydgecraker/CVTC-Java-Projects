package com.rcraker5.cvtc.bank;


public class FreeChecking extends BankAccount {
	
	public FreeChecking(String name, double balance) {
		super(name, balance);
	}
	
	
	@Override
	protected double getMinBalance() {
		return 5.0;
	}
	
	
	@Override
	public boolean acrueInterest() {
		return false;
	}
	
	
	public String toString() {
		return super.toString() + "\nAccount Type: Free Checking";
	}
	
}
