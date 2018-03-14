package com.rcraker5.oop.geomcalc;


import java.util.Scanner;


public class GeometryCalculator {
	
	private static Scanner input;
	
	
	public static void main(String[] args) {
		boolean quit = false;
		input = new Scanner(System.in);
		String ans = "";
		int choice = -1;
		while (!quit) {
			ans = "";
			choice = -1;
			while (choice <= 0 || choice > 4) {
				System.out.println("What would you like to do?\n1. Calculate the Area of a Circle\n2. Calculate the Area of a Rectangle\n3. Calculate the Area of a Triangle\n4. Quit");
				ans = input.nextLine();
				if (!tryParseInt(ans)) {
					System.out.println("Please enter a number 1-4.\n\"" + ans + "\" was not recognized");
				} else {
					choice = Integer.parseInt(ans);
					if (choice <= 0 || choice > 4) {
						System.out.println("Please enter a VALID number.");
					} else {
						if (choice == 4) {
							quit = true;
						}
						if (!quit) {
							double area = -1;
							if (choice == 1) {
								while (area < 0) {
									double radius = loopForNumericalInput("Please enter the radius of the circle.", "was not recognized as a number or decimal.");
									area = Geometry.area(radius);
								}
							} else if (choice == 2) {
								while (area < 0) {
									double length = loopForNumericalInput("Please enter the length of the rectangle.", "was not recognized as a number or decimal.");
									double width = loopForNumericalInput("Please enter the width of the rectangle.", "was not recognized as a number or decimal.");
									area = Geometry.area(length, width);
								}
							} else {
								while (area < 0) {
									double base = loopForNumericalInput("Please enter the base of the triangle.", "was not recognized as a number or decimal.");
									double height = loopForNumericalInput("Please enter the height of the triangle.", "was not recognized as a number or decimal.");
									area = Geometry.area(base, height, true);
								}
							}
							
							System.out.println("The area of your " + convertIntToShapeString(choice) + " is " + area);
							
						}
					}
				}
			}
		}
	}
	
	
	public static String convertIntToShapeString(int choice) {
		if (choice == 1) {
			return "circle";
		} else if (choice == 2) {
			return "rectangle";
		} else if (choice == 3) {
			return "triangle";
		} else {
			return "[Error: Shape not recognized]";
		}
	}
	
	
	public static double loopForNumericalInput(String prompt, String failure) {
		String ans = "";
		while (!tryParseDouble(ans)) {
			System.out.println(prompt);
			ans = input.nextLine();
			if (!tryParseDouble(ans)) {
				System.out.println("\"" + ans + "\" " + failure);
			}
		}
		return Float.parseFloat(ans);
	}
	
	
	public static boolean tryParseInt(String value) {
		try {
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	
	public static boolean tryParseDouble(String value) {
		try {
			Double.parseDouble(value);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
}
