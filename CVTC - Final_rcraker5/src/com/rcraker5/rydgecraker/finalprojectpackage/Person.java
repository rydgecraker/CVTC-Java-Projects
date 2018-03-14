package com.rcraker5.rydgecraker.finalprojectpackage;


public abstract class Person {
	
	protected String	firstName;
	protected String	lastName;
	protected String	birthDate;
	
	
	public Person(String firstName, String lastName, String birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getBirthDate() {
		return birthDate;
	}
	
	
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + "]";
	}
}
