package com.day41to60;

import java.util.Scanner;

public class ExamResultAnalyzer {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Exam Result Analyzer =====");
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks in Java: ");
        int java = sc.nextInt();
        System.out.print("Enter marks in DSA: ");
        int dsa = sc.nextInt();
        System.out.print("Enter marks in Database: ");
        int database = sc.nextInt();
        System.out.print("Enter marks in Web Development: ");
        int web = sc.nextInt();
        int total = java + dsa + database + web;
        double percentage = total / 4.0;
        String grade;
        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("\n----- EXAM RESULT -----");
        System.out.println("Student Name       : " + name);
        System.out.println("Java Marks         : " + java);
        System.out.println("DSA Marks          : " + dsa);
        System.out.println("Database Marks     : " + database);
        System.out.println("Web Development    : " + web);
        System.out.println("Total Marks        : " + total + " / 400");
        System.out.printf("Percentage         : %.2f%%%n", percentage);
        System.out.println("Grade              : " + grade);

        if (percentage >= 50) {
            System.out.println("Result             : PASS");
            System.out.println("Performance        : Good");
        } else {
            System.out.println("Result             : FAIL");
            System.out.println("Performance        : Needs Improvement");
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Exam result analysis completed.");
        System.out.println("-----------------------------------");

        sc.close();
    }
}
