package com.rcraker5.rydgecraker.finalprojectpackage;


public class Contact extends Person {
	
	protected String	emailAddress;
	protected String	phoneNumber;
	
	
	public Contact(String firstName, String lastName, String birthDate, String emailAddress, String phoneNumber) {
		super(firstName, lastName, birthDate);
		this.emailAddress = emailAddress;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public String toString() {
		return "Contact [emailAddress=" + emailAddress + ", phoneNumber=" + phoneNumber + " " + super.toString() + "]";
	}
}
