package com.codingJourney;

import java.util.Scanner;

public class RestaurantBillGenerator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("==================Restaurant Bill Generator================");
		System.out.println("enter coustmer name : ");
		String name=sc.next();
		System.out.println("Enter food item : ");
		String food=sc.next();
		System.out.println("enter the qunatity : ");
		int quantity =sc.nextInt();
		System.out.println("Enter price per item : ");
		double price=sc.nextDouble();
		System.out.println("Enter GST persentage(%) : ");
		int gst=sc.nextInt();
		double subtotal=price*quantity ;
		double gstAmount=subtotal*gst/100;
		double totalAmount=subtotal + gstAmount;
		System.out.println("===========================Bill==============================");
		System.out.println("Customer name : "+name);
		System.out.println("Selected Food  item : "+food);
		System.out.println("Food Items  quantity : "+quantity );
		System.out.printf("Price per item : %.2f%n ",price);
		System.out.printf("Subtotal  : %.2f%n ",subtotal);
		System.out.printf("GST (%d%%) : %.2f%n", gst, gstAmount);
		System.out.printf("Total Amount : %.2f%n ",totalAmount);
		System.out.println("-------------------- \nThank You! Visit Again ");
		
		sc.close();

	}

}
