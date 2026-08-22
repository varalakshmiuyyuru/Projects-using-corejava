package com.codingJourney;

import java.util.Scanner;

public class EmployeeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("========== Employee Salary Calculator ==========");
		System.out.println("Enter Employee id : ");
		int id=sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String name=sc.next();
		System.out.println("Enter the Basic salary : ");
		double basicSalary=sc.nextDouble();
		System.out.println("Enter HRA Percentage   : ");
		double hraPercent=sc.nextDouble();
		System.out.println("Enter DA Percentage    : ");
		double daPercent=sc.nextDouble();
		System.out.println("Enter Tax Percentage   : ");
		double taxPercent=sc.nextDouble();
		
		 double hraAmount = basicSalary * hraPercent / 100;
	        double daAmount = basicSalary * daPercent / 100;

	        double grossSalary = basicSalary + hraAmount + daAmount;

	        double taxAmount = grossSalary * taxPercent / 100;

	        double netSalary = grossSalary - taxAmount;

	        System.out.println("\n========== Salary Details ==========");
	        System.out.printf("Employee ID       : %d%n", id);
	        System.out.printf("Employee Name     : %s%n", name);
	        System.out.printf("Basic Salary      : ₹%.2f%n", basicSalary);
	        System.out.printf("HRA Amount        : ₹%.2f%n", hraAmount);
	        System.out.printf("DA Amount         : ₹%.2f%n", daAmount);
	        System.out.printf("Gross Salary      : ₹%.2f%n", grossSalary);
	        System.out.printf("Tax Amount        : ₹%.2f%n", taxAmount);
	        System.out.printf("Net Salary        : ₹%.2f%n", netSalary);
	        System.out.println("====================================");
		
sc.close();
	}

}
