package com.codingJourney;
import java.util.Scanner;
public class ParkingFeeCalculator {
	
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("========== PARKING FEE CALCULATOR ==========");
        System.out.print("Enter Number of Vehicles: ");
        int numberOfVehicles = sc.nextInt();
        String[] vehicleNumbers = new String[numberOfVehicles];
        String[] vehicleTypes = new String[numberOfVehicles];
        int[] parkingHours = new int[numberOfVehicles];
        double[] parkingFees = new double[numberOfVehicles];

        double totalParkingFee = 0;
        for (int i = 0; i < numberOfVehicles; i++) {

            System.out.println("\n========== Vehicle " + (i + 1) + " ==========");

            System.out.print("Enter Vehicle Number: ");
            vehicleNumbers[i] = sc.next();

            System.out.print("Enter Vehicle Type (Bike/Car/Bus): ");
            vehicleTypes[i] = sc.next();

            System.out.print("Enter Parking Hours: ");
            parkingHours[i] = sc.nextInt();

            if (parkingHours[i] <= 0) {
                System.out.println("Invalid Parking Hours!");
                parkingFees[i] = 0;
                continue;
            }

            if (vehicleTypes[i].equalsIgnoreCase("Bike")) {
                parkingFees[i] = parkingHours[i] * 20;
            } else if (vehicleTypes[i].equalsIgnoreCase("Car")) {
                parkingFees[i] = parkingHours[i] * 30;
            } else if (vehicleTypes[i].equalsIgnoreCase("Bus")) {
                parkingFees[i] = parkingHours[i] * 50;
            } else if (vehicleTypes[i].equalsIgnoreCase("other")) {
                    parkingFees[i] = parkingHours[i] * 70;
            } else {
                System.out.println("Invalid Vehicle Type!");
                parkingFees[i] = 0;
                continue;
            }
            totalParkingFee += parkingFees[i];
        }
        double gst = totalParkingFee * 0.18;
        double grandTotal = totalParkingFee + gst;
        System.out.println("\n================ PARKING RECEIPT ================");
        System.out.printf("%-15s %-10s %-8s %-10s%n",
                "Vehicle No", "Type", "Hours", "Fee");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < numberOfVehicles; i++) {
            System.out.printf("%-15s %-10s %-8d ₹%.2f%n",
                    vehicleNumbers[i],
                    vehicleTypes[i],
                    parkingHours[i],
                    parkingFees[i]);
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("Total Parking Fee : ₹%.2f%n", totalParkingFee);
        System.out.printf("GST (18%%)         : ₹%.2f%n", gst);
        System.out.printf("Grand Total       : ₹%.2f%n", grandTotal);
        System.out.println("=================================================");
        System.out.println("Thank You! Visit Again.");

        sc.close();
    }
}