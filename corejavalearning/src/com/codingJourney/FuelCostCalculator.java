package com.codingJourney;

import java.util.Scanner;

public class FuelCostCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance travelled (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter vehicle mileage (km/l): ");
        double mileage = sc.nextDouble();

        System.out.print("Enter fuel price per litre: ");
        double fuelPrice = sc.nextDouble();

        double fuelRequired = distance / mileage;
        double totalCost = fuelRequired * fuelPrice;

        System.out.println("\nFuel Required: " + fuelRequired + " litres");
        System.out.println("Total Fuel Cost: ₹" + totalCost);

        sc.close();
    }
}
