package com.rcraker5.cvtc.empApp;


public abstract class Employee {
	
	/**
	 * Name of the employee
	 */
	protected String	employeeName;
	
	/**
	 * The employee ID number. </br>
	 * Consists of 4 characters with a layout as: XXX-L. Where X is a number 0 - 9 and L is a letter
	 * A - M
	 */
	protected String	employeeNumber;
	
	/**
	 * The date the employee was hired.
	 */
	protected String	hireDate;
	
	
	public Employee(String employeeName, String employeeNumber, String hireDate) {
		this.employeeName = employeeName;
		this.employeeNumber = employeeNumber;
		this.hireDate = hireDate;
	}
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	
	
	
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	
	
	public String getHireDate() {
		return hireDate;
	}
	
	
	
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	
	
	public String toString() {
		String s = "";
		s += "---------\n";
		s += "Name: " + employeeName + "\n";
		s += "Employee #: " + employeeNumber + "\n";
		s += "Hire Date: " + hireDate + "\n";
		return s;
	}
}
