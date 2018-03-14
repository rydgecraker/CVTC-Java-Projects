package com.rcraker5.cvtc.empApp;


public class ShiftSupervisor extends Employee {
	
	/**
	 * The salary earned yearly by the Shift Supervisor.
	 */
	protected double	annualSalary;
	
	/**
	 * The yearly bonus afforded to the Shift Supervisor.
	 */
	protected double	annualBonus;
	
	
	public ShiftSupervisor(String employeeName, String employeeNumber, String hireDate, double annualSalary, double annualBonus) {
		super(employeeName, employeeNumber, hireDate);
		this.annualSalary = annualSalary;
		this.annualBonus = annualBonus;
	}
	
	
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	
	
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	
	
	public double getAnnualBonus() {
		return annualBonus;
	}
	
	
	
	public void setAnnualBonus(double annualBonus) {
		this.annualBonus = annualBonus;
	}
	
	
	public String toString() {
		String s = super.toString();
		s += "Title: Shift Supervisor\n";
		s += "Annual Salary: $" + annualSalary + "\n";
		s += "Annual Bonus: $" + annualBonus;
		return s;
	}
	
}
