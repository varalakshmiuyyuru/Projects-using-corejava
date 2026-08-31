package com.codingJourney;

import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== INCOME TAX CALCULATOR ==========");

        System.out.print("Enter Taxpayer Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Annual Income : ");
        double income = sc.nextDouble();

        System.out.print("Enter Deduction Amount : ");
        double deduction = sc.nextDouble();

        double taxableIncome = income - deduction;

        if (taxableIncome < 0) {
            taxableIncome = 0;
        }

        double tax = 0;

        if (taxableIncome <= 300000) {

            tax = 0;

        } else if (taxableIncome <= 600000) {

            tax = (taxableIncome - 300000) * 0.05;

        } else if (taxableIncome <= 900000) {

            tax = (300000 * 0.05)
                    + (taxableIncome - 600000) * 0.10;

        } else if (taxableIncome <= 1200000) {

            tax = (300000 * 0.05)
                    + (300000 * 0.10)
                    + (taxableIncome - 900000) * 0.15;

        } else {

            tax = (300000 * 0.05)
                    + (300000 * 0.10)
                    + (300000 * 0.15)
                    + (taxableIncome - 1200000) * 0.20;
        }

        double netIncome = taxableIncome - tax;

        System.out.println("\n================ TAX CALCULATION REPORT ================");

        System.out.println("Taxpayer Name       : " + name);
        System.out.printf("Gross Annual Income : %.2f%n", income);
        System.out.printf("Deductions          : %.2f%n", deduction);

        System.out.println("---------------------------------------------------------");

        System.out.printf("Taxable Income      : %.2f%n", taxableIncome);

        System.out.println("\nTax Slab Details:");

        System.out.println("0 - 300000        : No Tax");
        System.out.println("300001 - 600000   : 5%");
        System.out.println("600001 - 900000   : 10%");
        System.out.println("900001 - 1200000  : 15%");
        System.out.println("Above 1200000      : 20%");

        System.out.println("---------------------------------------------------------");

        System.out.printf("Income Tax          : %.2f%n", tax);
        System.out.printf("Net Income          : %.2f%n", netIncome);

        System.out.println("---------------------------------------------------------");

        System.out.println("Tax Calculation Completed Successfully.");

        System.out.println("=========================================================");

        sc.close();
    }
}