package com.bridgelabz;

public class EmpWageBuilderUC8 {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public static int computeEmpWage(String company, int empRatePerHour, int numbOfWorkingDays, int maxHrsPerMonth) {

		int empHrs = 0, toalEmpHrs = 0,totalWorkingDays = 0;

		while (toalEmpHrs <= maxHrsPerMonth && totalWorkingDays < numbOfWorkingDays) {
			totalWorkingDays ++;
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
			toalEmpHrs += empHrs;

			System.out.println("Day " + totalWorkingDays + " Emp Hrs: " + empHrs);

		}
		int totalEmpWage = toalEmpHrs * empRatePerHour;
		System.out.println("Total Emp Wage of an employee in " + company + " is " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		computeEmpWage("Big Bazar", 18, 22, 100);
		computeEmpWage("Siddasiri Mart", 15, 25, 100);
	}
}
