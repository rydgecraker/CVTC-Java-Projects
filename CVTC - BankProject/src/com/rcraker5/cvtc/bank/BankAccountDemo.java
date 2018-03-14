package com.rcraker5.cvtc.bank;


public class BankAccountDemo {
	
	public static void main(String[] args) {
		BusinessChecking bc = new BusinessChecking("John Doe", 5000.00);
		FreeChecking fc = new FreeChecking("James Doed", 5000.00);
		SavingsAccount sav = new SavingsAccount("Jack Doe-er", 5000.00);
		
		System.out.println(bc);
		System.out.println(fc);
		System.out.println(sav);
		
		bc.acrueInterest();
		fc.acrueInterest();
		sav.acrueInterest();
		
		System.out.println(bc);
		System.out.println(fc);
		System.out.println(sav);
		
		bc.deposit(500.00);
		fc.deposit(500.00);
		sav.deposit(500.00);
		
		System.out.println(bc);
		System.out.println(fc);
		System.out.println(sav);
		
		bc.withdraw(2000.00);
		fc.withdraw(2000.00);
		sav.withdraw(2000.00);
		
		System.out.println(bc);
		System.out.println(fc);
		System.out.println(sav);
	}
	
}
