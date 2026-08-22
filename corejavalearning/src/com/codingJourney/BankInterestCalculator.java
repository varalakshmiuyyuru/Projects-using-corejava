package com.codingJourney;

import java.util.Scanner;

public class BankInterestCalculator {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Principal Amount: ");
	        double principal = sc.nextDouble();

	        System.out.print("Enter Rate of Interest: ");
	        double rate = sc.nextDouble();

	        System.out.print("Enter Time (in years): ");
	        double time = sc.nextDouble();

	        double simpleInterest = (principal * rate * time) / 100;
	        double totalAmount = principal + simpleInterest;

	        System.out.println("\n----- Bank Interest Details -----");
	        System.out.printf("Principal Amount: %.2f%n", principal);
	        System.out.printf("Rate of Interest: %.2f%%%n", rate);
	        System.out.printf("Time: %.2f years%n", time);
	        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
	        System.out.printf("Total Amount: %.2f%n", totalAmount);

	        sc.close();
		
	}

}
