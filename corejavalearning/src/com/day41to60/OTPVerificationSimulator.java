package com.day41to60;
import java.util.Scanner;
public class OTPVerificationSimulator {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int generatedOTP = 583214;
        System.out.println("===== OTP Verification Simulator =====");
        System.out.println("Your OTP is: " + generatedOTP);

        System.out.print("Enter the OTP: ");
        int enteredOTP = sc.nextInt();

        System.out.println("\n----- OTP Verification Result -----");

        if (enteredOTP == generatedOTP) {

            System.out.println("Entered OTP     : " + enteredOTP);
            System.out.println("OTP Verification: Successful");
            System.out.println("Status          : Verified");
            System.out.println("Access          : Granted");
            System.out.println("Message         : OTP verified successfully.");
        } else {
            System.out.println("Entered OTP     : " + enteredOTP);
            System.out.println("OTP Verification: Failed");
            System.out.println("Status          : Not Verified");
            System.out.println("Access          : Denied");
            System.out.println("Message         : Invalid OTP. Please try again.");
        }

        System.out.println("\n--------------------------------------");
        System.out.println("OTP verification process completed.");
        System.out.println("--------------------------------------");

        sc.close();
    }
}