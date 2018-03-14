package edu.cvtc.web.modal;


import java.io.Serializable;


public class Person implements Serializable {
	
	private static final long	serialVersionUID	= -7773396779739061160L;
	
	
	private String				firstName;
	private String				lastName;
	private Integer				age;
	private String				favoriteColor;
	
	
	public Person(final String firstName, final String lastName, final int age, final String favoriteColor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.favoriteColor = favoriteColor;
	}
	
	
	public Person() {
		
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public int getAge() {
		return age;
	}
	
	
	public Integer getAgeAsInteger() {
		return age;
	}
	
	
	public String getFavoriteColor() {
		return favoriteColor;
	}
	
	
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", favoriteColor=" + favoriteColor + "]";
	}
	
}
