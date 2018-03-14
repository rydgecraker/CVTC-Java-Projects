package com.rcraker5.cvtc.empApp;


public class ProductionWorker extends Employee {
	
	/**
	 * The shift the employee works on.
	 */
	protected int		shift;
	
	/**
	 * The rate the employee is paid per hour
	 */
	protected double	hourlyPayRate;
	
	
	public ProductionWorker(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate) {
		super(employeeName, employeeNumber, hireDate);
		this.shift = shift;
		this.hourlyPayRate = hourlyPayRate;
	}
	
	
	
	public int getShift() {
		return shift;
	}
	
	
	
	public void setShift(int shift) {
		this.shift = shift;
	}
	
	
	
	public double getHourlyPayRate() {
		return hourlyPayRate;
	}
	
	
	
	public void setHourlyPayRate(double hourlyPayRate) {
		this.hourlyPayRate = hourlyPayRate;
	}
	
	
	public String toString() {
		String s = super.toString();
		s += "Title: Production Worker\n";
		s += "Shift: " + shift + "\n";
		s += "Hourly Pay: $" + hourlyPayRate;
		return s;
	}
	
}
