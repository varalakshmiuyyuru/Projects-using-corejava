package com.codingJourney;

import java.util.Scanner;

public class MovieTicketPriceCalculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println("          Movie Ticket Price Calculator");
		System.out.println("==============================================");
		System.out.println("Enter movie name : ");
		String movieName=sc.nextLine();
		System.out.println("Enter Ticket type (Regular/premium) : ");
		String ticketType=sc.next();
		System.out.println("Enter Number of Tickets : ");
		int numberOfTickets=sc.nextInt();
		 double ticketPrice = 0;
		 
		 //ticket price calculation
		 ticketType = ticketType.toLowerCase();
		 if (ticketType.equals("regular")) {
		     ticketPrice = 150;
		 } else if (ticketType.equals("premium")) {
		     ticketPrice = 250;
		 } else {
		     System.out.println("Invalid Ticket Type");
		 }
		 
		 //total bill calculation
		 double totalAmount=ticketPrice*numberOfTickets;
		 
		//total bill presenting
		 System.out.println("\n=======================================");
	        System.out.println("          MOVIE TICKET BILL");
	        System.out.println("=======================================");
	        System.out.println("Movie Name         : " + movieName);
	        System.out.println("Ticket Type        : " + ticketType);
	        System.out.println("Number of Tickets  : " + numberOfTickets);
	        System.out.println("Price Per Ticket   : Rs" + ticketPrice);
	        System.out.println("---------------------------------------");
	        System.out.println("Total Amount       : Rs" + totalAmount);
	        System.out.println("=======================================");
	        System.out.println("Enjoy Your Movie! ");
		 
		sc.close();
	}

}
