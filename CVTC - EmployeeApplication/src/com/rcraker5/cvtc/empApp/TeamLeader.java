package com.rcraker5.cvtc.empApp;


public class TeamLeader extends ProductionWorker {
	
	/**
	 * The bonus afforded to Team Leaders on a monthly basis.
	 */
	protected double	monthlyBonus;
	
	/**
	 * The number of hours required to become a Team Leader
	 */
	protected int		trainHoursRequired;
	
	/**
	 * The number of hours the employee has completed towards becoming a team leader.
	 */
	protected int		trainHoursCompleted;
	
	
	public TeamLeader(String employeeName, String employeeNumber, String hireDate, int shift, double hourlyPayRate, double monthlyBonus, int trainHoursRequired, int trainHoursCompleted) {
		super(employeeName, employeeNumber, hireDate, shift, hourlyPayRate);
		this.monthlyBonus = monthlyBonus;
		this.trainHoursCompleted = trainHoursCompleted;
		this.trainHoursRequired = trainHoursRequired;
	}
	
	
	
	public double getMonthlyBonus() {
		return monthlyBonus;
	}
	
	
	
	public void setMonthlyBonus(double monthlyBonus) {
		this.monthlyBonus = monthlyBonus;
	}
	
	
	
	public int getTrainHoursRequired() {
		return trainHoursRequired;
	}
	
	
	
	public void setTrainHoursRequired(int trainHoursRequired) {
		this.trainHoursRequired = trainHoursRequired;
	}
	
	
	
	public int getTrainHoursCompleted() {
		return trainHoursCompleted;
	}
	
	
	
	public void setTrainHoursCompleted(int trainHoursCompleted) {
		this.trainHoursCompleted = trainHoursCompleted;
	}
	
	
	public String toString() {
		String s = super.toString();
		s += "\nSubTitle: Team Leader\n";
		s += "Monthly Bonus: $" + monthlyBonus + "\n";
		s += "Train Hours (completed/required): " + trainHoursCompleted + "/" + trainHoursRequired + "\n";
		return s;
	}
}
