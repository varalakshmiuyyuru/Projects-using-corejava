package com.day41to60;
import java.util.Scanner;
public class StudentScholarshipEligibilityChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Student Scholarship Eligibility Checker =====");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student age: ");
        int age = sc.nextInt();
        System.out.print("Enter percentage: ");
        double percentage = sc.nextDouble();
        System.out.print("Enter annual family income: ");
        double income = sc.nextDouble();
        System.out.print("Do you have a valid scholarship application? (yes/no): ");
        String application = sc.next();
        System.out.println("\n----- Scholarship Eligibility Result -----");
        if (age >= 18 && percentage >= 75
                && income <= 300000
                && application.equalsIgnoreCase("yes")) {
            System.out.println("Student Name       : " + name);
            System.out.println("Age                : " + age);
            System.out.println("Percentage         : " + percentage + "%");
            System.out.println("Annual Family Income: ₹" + income);
            System.out.println("Application Status : Valid");
            System.out.println("Status             : Eligible");
            System.out.println("Message            : Congratulations! You are eligible for the scholarship.");
        } else {
            System.out.println("Student Name       : " + name);
            System.out.println("Age                : " + age);
            System.out.println("Percentage         : " + percentage + "%");
            System.out.println("Annual Family Income: ₹" + income);
            System.out.println("Application Status : " + application);
            System.out.println("Status             : Not Eligible");
            if (age < 18) {
                System.out.println("Reason: Minimum age requirement is 18 years.");
            }

            if (percentage < 75) {
                System.out.println("Reason: Minimum percentage requirement is 75%.");
            }

            if (income > 300000) {
                System.out.println("Reason: Annual family income must not exceed ₹3,00,000.");
            }

            if (!application.equalsIgnoreCase("yes")) {
                System.out.println("Reason: A valid scholarship application is required.");
            }
        }

        System.out.println("\n---------------------------------------------");
        System.out.println("Scholarship eligibility verification completed.");
        System.out.println("---------------------------------------------");

        sc.close();
    }
}