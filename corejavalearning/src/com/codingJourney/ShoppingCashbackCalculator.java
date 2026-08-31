package com.codingJourney;
import java.util.Scanner;

public class ShoppingCashbackCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("        SHOPPING CASHBACK CALCULATOR");
        System.out.println("==========================================");

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Shopping Amount: ₹");
        double amount = sc.nextDouble();

        double cashbackRate;
        String cashbackCategory;

        // Calculate cashback based on shopping amount
        if (amount >= 5000) {
            cashbackRate = 20;
            cashbackCategory = "Premium Cashback";
        } 
        else if (amount >= 3000) {
            cashbackRate = 15;
            cashbackCategory = "High Cashback";
        } 
        else if (amount >= 1000) {
            cashbackRate = 10;
            cashbackCategory = "Standard Cashback";
        } 
        else {
            cashbackRate = 5;
            cashbackCategory = "Basic Cashback";
        }

        // Calculate cashback
        double cashback = amount * cashbackRate / 100;

        // Calculate final amount
        double finalAmount = amount - cashback;

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("              SHOPPING BILL");
        System.out.println("------------------------------------------");

        System.out.printf("Customer Name       : %s%n", name);
        System.out.printf("Shopping Amount     : ₹%.2f%n", amount);
        System.out.printf("Cashback Category   : %s%n", cashbackCategory);
        System.out.printf("Cashback Percentage : %.0f%%%n", cashbackRate);
        System.out.printf("Cashback Earned     : ₹%.2f%n", cashback);

        System.out.println("------------------------------------------");

        System.out.printf("Final Amount        : ₹%.2f%n", finalAmount);

        System.out.println("------------------------------------------");

        System.out.printf("Congratulations %s!%n", name);
        System.out.printf("You saved ₹%.2f through cashback.%n", cashback);

        System.out.println();
        System.out.println("Thank you for shopping with us!");
        System.out.println("==========================================");

        sc.close();
    }
}
