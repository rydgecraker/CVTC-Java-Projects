package com.cvtc.edu;


public class Main {
	
	public Main() {
		
	}
	
	
	public static void main(String[] args) {
		Car c = new Car("Red", "Corvette", 205);
		c.accelerate(55);
		System.out.println(c.getSpeed());
	}
	
}
