package com.rcraker5.cvtc.bank;


public abstract class BankAccount {
	
	protected String	name;
	protected double	balance;
	
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	
	public boolean withdraw(double amount) {
		if (balance - amount > getMinBalance()) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
	}
	
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	
	protected abstract double getMinBalance();
	
	
	public abstract boolean acrueInterest();
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public double getBalance() {
		return balance;
	}
	
	
	public String toString() {
		return "-----\nAccount Name: " + name + "\nBalance: $" + balance;
	}
	
	
	
}
