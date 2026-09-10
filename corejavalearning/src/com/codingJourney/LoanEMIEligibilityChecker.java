package com.codingJourney;


import java.util.Scanner;

public class LoanEMIEligibilityChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your monthly income: ");
        double income = sc.nextDouble();

        System.out.print("Enter your monthly expenses: ");
        double expenses = sc.nextDouble();

        System.out.print("Enter loan amount: ");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate (%): ");
        double annualRate = sc.nextDouble();

        System.out.print("Enter loan tenure (in years): ");
        int years = sc.nextInt();

        double monthlyRate = annualRate / (12 * 100);
        int months = years * 12;

        double emi = (loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        double availableIncome = income - expenses;

        System.out.println("\n--- Loan Eligibility Details ---");
        System.out.printf("Monthly EMI: %.2f%n", emi);
        System.out.printf("Available Income: %.2f%n", availableIncome);

        if (emi <= availableIncome * 0.5) {
            System.out.println("Loan Eligibility: Eligible");
        } else {
            System.out.println("Loan Eligibility: Not Eligible");
        }

        sc.close();
    }
}