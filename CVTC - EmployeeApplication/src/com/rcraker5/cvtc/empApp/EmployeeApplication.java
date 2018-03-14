package com.rcraker5.cvtc.empApp;


public class EmployeeApplication {
	
	public static void main(String[] args) {
		
		/*
		 * I'm not creating an instance of employee because I made it an abstract class. There's no
		 * reason to create a general type employee when you have all of the specific types already
		 * created as classes.
		 */
		
		ProductionWorker pworker = new ProductionWorker("John Doe", "009-M", "10/10/2010", 0, 15.25);
		ShiftSupervisor shSup = new ShiftSupervisor("John M. Crazyspear", "000-A", "1/2/1954", 85000.00, 1200.00);
		TeamLeader tLead = new TeamLeader("Bragin McKinley", "999-C", "4/12/1985", 1, 20.35, 0.25, 20, 19);
		
		System.out.println(pworker);
		System.out.println(shSup);
		System.out.println(tLead);
	}
	
}
