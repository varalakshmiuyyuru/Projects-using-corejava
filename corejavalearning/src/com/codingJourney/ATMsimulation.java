package com.codingJourney;
import java.util.Scanner;
public class ATMsimulation {
	public static void main(String[] args) {
		//create scanner object to read user input
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Initial Balance :");
	//read initial account balance
	double balance=sc.nextDouble();
	int choice;
	double amount;
        //repeat the menu until user choose Exit
        do {
        	//Display the ATM menu
        	System.out.println("-----------ATM Menu-------------");
        	System.out.println("1.check the balance");
        	System.out.println("2.Deposite amount");
        	System.out.println("3.withdrwal ammount");
        	System.out.println("4.Exit");
        	System.out.print("Enter your choice: ");
            choice = sc.nextInt();   // <-- Read choice every time-
        	switch(choice) {
        	case 1:
        		System.out.println("Available Balence : "+balance);
        		break;
        	case 2:
        		System.out.print("Enter your amount: ");
                amount = sc.nextDouble(); 
        		System.out.println("Enter Deposite amount :Rs"+amount);
        		if(amount>0) {
        			balance +=amount;
        			System.out.println(" Rs "+amount+" Deposited successfully");
        		}
        		System.out.println("Available Balance : Rs"+balance);
        		break		;
        	case 3:
        		System.out.print("Enter your amount: ");
                amount = sc.nextDouble(); 
        		System.out.println("Enter Withdrwal amount : Rs"+amount);
        		if(amount > 0 && amount <= balance) {
        			System.out.println(" Rs "+amount+" Withdrwal successfully");
        			System.out.println("Available Balance : Rs"+(balance-amount));
        		}else if(amount > balance){
        			System.out.println("Insufficent Balence");
        		}else {
        			System.out.println("enter valid amount");
        		}
        		break;
        	case 4:
        		System.out.println(" Thank You ");
        		break;
        		default:
        			System.out.println("Invalid choice");
        		break;
        	}
        }while(choice!=4);
	}
}
