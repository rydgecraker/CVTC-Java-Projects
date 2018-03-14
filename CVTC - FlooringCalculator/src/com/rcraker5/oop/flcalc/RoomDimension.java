package com.rcraker5.oop.flcalc;


public class RoomDimension {
	
	private float	length;
	private float	width;
	
	
	public RoomDimension(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	
	public float getArea() {
		return length * width;
	}
	
	
	public float getLength() {
		return length;
	}
	
	
	public void setLength(float length) {
		this.length = length;
	}
	
	
	public float getWidth() {
		return width;
	}
	
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	
	
	
}
