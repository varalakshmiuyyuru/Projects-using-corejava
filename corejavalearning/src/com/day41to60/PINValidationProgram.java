package com.day41to60;

import java.util.Scanner;

public class PINValidationProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctPIN = "1234";

        System.out.println("===== PIN Validation Program =====");

        System.out.print("Enter your PIN: ");
        String enteredPIN = sc.nextLine();

        System.out.println("\n----- PIN Validation Result -----");

        if (enteredPIN.equals(correctPIN)) {

            System.out.println("Entered PIN    : " + enteredPIN);
            System.out.println("PIN Validation : Successful");
            System.out.println("Status         : Valid PIN");
            System.out.println("Access         : Granted");
            System.out.println("Message        : PIN verified successfully.");
        } else {
            System.out.println("Entered PIN    : " + enteredPIN);
            System.out.println("PIN Validation : Failed");
            System.out.println("Status         : Invalid PIN");
            System.out.println("Access         : Denied");
            System.out.println("Message        : Incorrect PIN. Please try again.");
        }
        System.out.println("\n----------------------------------");
        System.out.println("PIN validation process completed.");
        System.out.println("----------------------------------");

        sc.close();
    }
}