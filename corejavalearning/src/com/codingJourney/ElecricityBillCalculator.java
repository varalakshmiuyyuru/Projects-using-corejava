package com.codingJourney;

import java.util.Scanner;

public class ElecricityBillCalculator {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
	       System.out.println("============Electricity Bill Calculator==========");
	       System.out.println("Enter Customer ID : ");
           int id=sc.nextInt();
           
           System.out.println("Enter Customer Name :");
           String name=sc.next();
           
           System.out.println("Enter number of units burned(ex:128 or 1223.99) :");
           double units=sc.nextDouble();
           
           System.out.println("============================================");
           double bill=0;
           
        if(units >= 0 && units<=100) {
        	
        	bill=units*2;
        	
        	System.out.println("Customer Id :"+id);
        	System.out.println("Customer Name :"+name);
        	System.out.println("Number of units burned"+units);
            System.out.println("your bill :"+bill);
            System.out.println("============================================");
            System.out.println("Thanks For Using Electricity Bill Calculator");
            
        }else if(units >= 101 && units<=200) {
        
        	System.out.println("Customer Id :"+id);
        	System.out.println("Customer Name :"+name);
        	System.out.println("Number of units burned"+units);
        	bill=units*3;
            System.out.println("your bill :"+bill);
            System.out.println("============================================");
            System.out.println("Thanks For Using Electricity Bill Calculator");
            
        }else if(units >= 201) {
        	
        	bill=units*4;
        	
        	System.out.println("Customer Id :"+id);
        	System.out.println("Customer Name :"+name);
        	System.out.println("Number of units burned"+units);
            System.out.println("your bill :"+bill);
            System.out.println("=============================================");
            System.out.println("Thanks For Using Electricity Bill Calculator");
        }
        else {
        	System.out.println("Invalid units");
        	
        }
        
        sc.close();
      }

}
