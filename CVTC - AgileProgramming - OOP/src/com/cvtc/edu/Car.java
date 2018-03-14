package com.cvtc.edu;


public class Car {
	
	private String	color		= "";
	private String	model		= "";
	private int		speed		= 0;
	private int		maxSpeed	= 100;
	
	
	public Car(String color, String model, int maxSpeed) {
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
		this.model = model;
	}
	
	
	public int getSpeed() {
		return speed;
	}
	
	
	public void accelerate(int amount) {
		if (amount + speed >= maxSpeed) {
			speed = maxSpeed;
		} else if (amount + speed <= 0) {
			speed = 0;
		} else {
			speed += amount;
		}
	}
	
	
}
