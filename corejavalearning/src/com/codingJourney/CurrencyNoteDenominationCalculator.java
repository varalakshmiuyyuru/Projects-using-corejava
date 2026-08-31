package com.codingJourney;

	import java.util.Scanner;

	public class CurrencyNoteDenominationCalculator {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("========== CURRENCY NOTE DENOMINATION CALCULATOR ==========");

	        System.out.print("Enter Amount: ");
	        int amount = sc.nextInt();

	        int originalAmount = amount;

	        int note500 = amount / 500;
	        amount = amount % 500;

	        int note200 = amount / 200;
	        amount = amount % 200;

	        int note100 = amount / 100;
	        amount = amount % 100;

	        int note50 = amount / 50;
	        amount = amount % 50;

	        int note20 = amount / 20;
	        amount = amount % 20;

	        int note10 = amount / 10;
	        amount = amount % 10;

	        int coin5 = amount / 5;
	        amount = amount % 5;

	        int coin2 = amount / 2;
	        amount = amount % 2;

	        int coin1 = amount;

	        int total = note500 + note200 + note100 + note50
	                  + note20 + note10 + coin5 + coin2 + coin1;

	        System.out.println("\n================ NOTE BREAKDOWN ================");

	        System.out.println("Amount: ₹" + originalAmount);

	        System.out.println("\n₹500 Notes : " + note500);
	        System.out.println("₹200 Notes : " + note200);
	        System.out.println("₹100 Notes : " + note100);
	        System.out.println("₹50 Notes  : " + note50);
	        System.out.println("₹20 Notes  : " + note20);
	        System.out.println("₹10 Notes  : " + note10);
	        System.out.println("₹5 Coins   : " + coin5);
	        System.out.println("₹2 Coins   : " + coin2);
	        System.out.println("₹1 Coins   : " + coin1);

	        System.out.println("\nTotal Notes/Coins: " + total);

	        System.out.println("==================================================");

	        sc.close();
	    }
	}

