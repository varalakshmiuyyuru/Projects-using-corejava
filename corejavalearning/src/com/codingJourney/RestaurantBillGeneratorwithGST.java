package com.codingJourney;

	import java.util.Scanner;

	public class RestaurantBillGeneratorwithGST {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("========= RESTAURANT BILL GENERATOR =========");

	        System.out.print("Enter Customer Name : ");
	        String customerName = sc.nextLine();

	        System.out.print("Enter Food Item : ");
	        String foodItem = sc.nextLine();

	        System.out.print("Enter Quantity : ");
	        int quantity = sc.nextInt();

	        System.out.print("Enter Price per Item : ");
	        double price = sc.nextDouble();

	        System.out.print("Enter GST Percentage : ");
	        double gstPercent = sc.nextDouble();

	        double subtotal = quantity * price;
	        double gstAmount = subtotal * gstPercent / 100;
	        double totalAmount = subtotal + gstAmount;

	        System.out.println("\n============== BILL ==============");

	        System.out.println("Customer Name   : " + customerName);
	        System.out.println("Food Item       : " + foodItem);
	        System.out.println("Quantity        : " + quantity);
	        System.out.printf("Price per Item  : ₹%.2f%n", price);
	        System.out.printf("Subtotal        : ₹%.2f%n", subtotal);
	        System.out.printf("GST (%.0f%%)      : ₹%.2f%n", gstPercent, gstAmount);
	        System.out.printf("Total Amount    : ₹%.2f%n", totalAmount);

	        System.out.println("\nThank You! Visit Again.");

	        sc.close();
	    }
	}


