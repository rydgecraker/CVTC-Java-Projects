package com.lawnCareProgram.rcraker5;


import java.util.ArrayList;


public class LawnCareMain {
	
	private ArrayList<Customer> customers;
	
	
	public LawnCareMain() {
		customers = new ArrayList<Customer>();
	}
	
	
	public void addCustomer(Customer c) {
		customers.add(c);
	}
	
	
	public boolean removeCustomer(String name) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).compareTo(name) == 0) {
				customers.remove(i);
				return true;
			}
		}
		return false;
	}
	
	
	public void changeSignUps(String name, boolean hedgeCutting, boolean mowing, boolean planting, boolean weedKilling) {
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).compareTo(name) == 0) {
				customers.set(i, new Customer(customers.get(i).getName(), customers.get(i).getAddress(), hedgeCutting, mowing, planting, weedKilling));
			}
		}
	}
	
	
	public void printAllCustomers() {
		for (int i = 0; i < customers.size(); i++) {
			System.out.println(customers.get(i).toString());
		}
	}
	
}
