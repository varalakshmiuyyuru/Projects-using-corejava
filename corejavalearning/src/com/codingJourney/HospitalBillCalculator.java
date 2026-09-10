package com.codingJourney;

import java.util.Scanner;

public class HospitalBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Room Charges: ");
        double roomCharges = sc.nextDouble();

        System.out.print("Enter Doctor Charges: ");
        double doctorCharges = sc.nextDouble();

        System.out.print("Enter Medicine Charges: ");
        double medicineCharges = sc.nextDouble();

        System.out.print("Enter Lab Charges: ");
        double labCharges = sc.nextDouble();

        double totalBill = roomCharges + doctorCharges + medicineCharges + labCharges;

        System.out.println("\n----- HOSPITAL BILL -----");
        System.out.println("Patient Name   : " + name);
        System.out.printf("Room Charges   : %.2f%n", roomCharges);
        System.out.printf("Doctor Charges : %.2f%n", doctorCharges);
        System.out.printf("Medicine       : %.2f%n", medicineCharges);
        System.out.printf("Lab Charges    : %.2f%n", labCharges);
        System.out.printf("Total Bill     : %.2f%n", totalBill);

        sc.close();
    }
}