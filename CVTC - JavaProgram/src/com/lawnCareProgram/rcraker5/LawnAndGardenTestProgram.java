package com.lawnCareProgram.rcraker5;


public class LawnAndGardenTestProgram {
	
	public static void main(String[] args) {
		LawnCareMain lcm = new LawnCareMain();
		
		// Add a few customers
		lcm.addCustomer(new Customer("John Doe", "1011 Fake Street", true, true, false, false));
		lcm.addCustomer(new Customer("Jack Dawson", "1012 Fake Street", true, true, true, true));
		lcm.addCustomer(new Customer("Gillian Demkie", "1051 Fake Street", false, true, false, true));
		lcm.addCustomer(new Customer("Jose Martinez", "1088 Fake Street", false, false, true, false));
		
		// Print out all the customers
		lcm.printAllCustomers();
		
		// Remove a customer
		lcm.removeCustomer("Jack Dawson");
		
		// Seperation in the console
		System.out.println("---------------------");
		
		// Print customers to show that Jack was removed
		lcm.printAllCustomers();
		
		// Seperation in the console
		System.out.println("---------------------");
		
		// Change the things John Doe is signed up for
		lcm.changeSignUps("John Doe", false, false, true, true);
		
		lcm.printAllCustomers();
	}
	
}
