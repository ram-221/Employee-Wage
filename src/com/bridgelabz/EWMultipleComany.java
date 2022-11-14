package com.bridgelabz;

public class EWMultipleComany {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	private int EMP_RATE_PER_HOUR;
	private int NUM_OF_WORKING_DAYS;
	private int MAX_HRS_IN_MONTH;

	public void computeWage(String company, int empRatePerHour, int numberOfWorkingDays, int maxHrs) {
		this.EMP_RATE_PER_HOUR = empRatePerHour;
		this.NUM_OF_WORKING_DAYS = numberOfWorkingDays;
		this.MAX_HRS_IN_MONTH = maxHrs;
		int empHrs;
		int empWage = 0;
		int totalWorkingDays = 0;
		int totalEmpHrs = 0;
		int totalEmpWage = 0;
		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Day " + totalWorkingDays + " Emp Hrs: " + empHrs + " Emp Wage: " + empWage);
			totalEmpWage += empWage;
		}
		totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Emp Wage of an employee in " + company + " is " + totalEmpWage);
	}

	public static void main(String[] args) {
		
		EWMultipleComany empWage = new EWMultipleComany();
		empWage.computeWage("Big Bazar", 18, 22, 100);
		empWage.computeWage("Siddasiri Mart", 15, 25, 100);
	}
}
