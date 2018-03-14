package com.rcraker5.oop.geomcalc;


public class Geometry {
	
	/*
	 * Returns the area of a circle
	 */
	public static double area(double radius) {
		if (radius < 0) {
			System.out.println("Error: Cannot calculate the area of a circle with a negative radius.");
			return -1;
		}
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	/*
	 * Returns the area of a rectangle
	 */
	public static double area(double length, double width) {
		if (length < 0 || width < 0) {
			System.out.println("Error: Cannot calculate the area of rectangle with negative measurements.");
			return -1;
		}
		return length * width;
	}
	
	
	/*
	 * Returns the area of a triangle
	 */
	public static double area(double base, double height, boolean triangle) {
		if (base < 0 || height < 0) {
			System.out.println("Error: Cannot calculate the area of triangle with negative measurements.");
			return -1;
		}
		return 0.5 * base * height;
	}
}
