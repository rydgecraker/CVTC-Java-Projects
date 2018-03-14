package com.rcraker5.oop.flcalc;


import java.util.Scanner;


public class FlooringCalculator {
	
	private static Scanner		input;
	private static RoomFlooring	rf;
	
	
	public static void main(String[] args) {
		input = new Scanner(System.in);
		float len = 0.0f;
		float wid = 0.0f;
		float sqft = 0.0f;
		len = loopForNumericalInput("Please Enter the length of the room in feet.", "is not a number or decimal. Please re-enter your answer.");
		wid = loopForNumericalInput("Please Enter the width of the room in feet.", "is not a number or decimal. Please re-enter your answer.");
		sqft = loopForNumericalInput("Please Enter the price of flooring per square foot.", "is not a number or decimal. Please re-enter your answer.");
		
		rf = new RoomFlooring(sqft, new RoomDimension(len, wid));
		
		System.out.println("The total price of your room is: $" + String.format("%.2f", rf.getTotalCost()));
		
		
	}
	
	
	public static float loopForNumericalInput(String prompt, String failure) {
		String ans = "";
		while (!tryParseFloat(ans)) {
			System.out.println(prompt);
			ans = input.nextLine();
			if (!tryParseFloat(ans)) {
				System.out.println("\"" + ans + "\" " + failure);
			}
		}
		return Float.parseFloat(ans);
	}
	
	
	public static boolean tryParseFloat(String value) {
		try {
			Float.parseFloat(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
}
