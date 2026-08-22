package com.codingJourney;

import java.util.Scanner;

public class SmartCalculaterMenu {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		double num1=0;
		double num2=0;
		
		while(true) {
			
			System.out.println("=======Smart Calculator=======");
			System.out.println("1.Addition");
			System.out.println("2.Substraction ");
			System.out.println("3.Multiplication ");
			System.out.println("4.Division");
			System.out.println("5.Modulus Division ");
			System.out.println("6.Power");
			System.out.println("7.Square");
	        System.out.println("8.Cube");
			System.out.println("9.Exit");
			
			System.out.println("enter your choice:");
			int choice=sc.nextInt();
			
			if(choice==9) {
		    System.out.println("Thank you for using Smart Calculator ");   
			}
			
			 if (choice >= 1 && choice <= 6) {
	                System.out.print("Enter first number: ");
	                num1 = sc.nextDouble();
			 
	                System.out.print("Enter second number: ");
	                num2 = sc.nextDouble();
	                
	            } else if (choice == 7 || choice == 8) {
	                System.out.print("Enter a number: ");
	                num1 = sc.nextDouble();    
	                
	            }
			 
			 switch(choice) {
			 
			 case 1:
				 System.out.println("Addition : "+(num1+num2));
				 break;
				 
			 case 2:
                 System.out.println("Substraction : " + (num1 - num2));
                 break;
                 
             case 3:
                 System.out.println("Multiplication" + (num1 * num2));
                 break;
                 
             case 4:
                 if (num2 != 0)
                     System.out.println("Division : " + (num1 / num2));
                 else
                     System.out.println("Division by zero is not allowed.");
                 break;
                 
             case 5:
                 if (num2 != 0)
                     System.out.println("Modulus : " + (num1 % num2));
                 else
                     System.out.println("Modulus by zero is not allowed.");
                 break;
                 
             case 6:
                 System.out.println("Powers :" + Math.pow(num1, num2));
                 break;
                 
             case 7:
                 System.out.println("Square : " + (num1 * num1));
                 break;
                 
             case 8:
                 System.out.println("Cube : " + (num1 * num1 * num1));
                 break;
                 
             case 9:
                 System.out.println("You choice Exit");
                 break;
                 
             default:
                 System.out.println("Invalid Choice!");
			 }	
		}


	}

}
