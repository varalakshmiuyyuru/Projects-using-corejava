package com.codingJourney;
import java.util.Scanner;

public class LibraryFineCalculator {
	
		public static void main(String[] args) {
			
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter Book Name: ");
	        String bookName = sc.nextLine();

	        System.out.print("Enter Number of Days Late: ");
	        int daysLate = sc.nextInt();

	        double fine;
	        if (daysLate <= 0) {
	            fine = 0;
	        } 
	        else if (daysLate <= 5) {
	            fine = daysLate * 2;
	        } 
	        else if (daysLate <= 10) {
	            fine = daysLate * 5;
	        } 
	        else {
	            fine = daysLate * 10;
	        }
	        System.out.println("\n----- Library Fine Details -----");
	        System.out.println("Book Name          : " + bookName);
	        System.out.println("Days Late          : " + daysLate);
	        System.out.printf("Fine Amount        : ₹%.2f%n", fine);
	        System.out.println("--------------------------------");
		
	        sc.close();
	}

}
