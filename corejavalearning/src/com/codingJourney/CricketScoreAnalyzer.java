package com.codingJourney;

import java.util.Scanner;

public class CricketScoreAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== CRICKET SCORE ANALYZER ==========");

        System.out.print("Enter Team Name : ");
        String teamName = sc.nextLine();

        System.out.print("Enter Total Overs : ");
        int overs = sc.nextInt();

        System.out.print("Enter Runs Scored : ");
        int runs = sc.nextInt();

        System.out.print("Enter Wickets Lost : ");
        int wickets = sc.nextInt();

        System.out.print("Enter Extras : ");
        int extras = sc.nextInt();

        System.out.print("Enter Number of 4s : ");
        int fours = sc.nextInt();

        System.out.print("Enter Number of 6s : ");
        int sixes = sc.nextInt();

        double runRate = (double) runs / overs;

        int boundaryRuns = (fours * 4) + (sixes * 6);

        int remainingWickets = 10 - wickets;

        String status;

        if (runRate >= 9) {
            status = "Excellent Score";
        } 
        else if (runRate >= 7) {
            status = "Good Score";
        } 
        else if (runRate >= 5) {
            status = "Average Score";
        } 
        else {
            status = "Low Score";
        }

        System.out.println("\n=============== MATCH SUMMARY ===============");

        System.out.println("Team Name           : " + teamName);
        System.out.println("Total Overs         : " + overs);
        System.out.println("Runs Scored         : " + runs);
        System.out.println("Wickets Lost        : " + wickets);
        System.out.println("Extras              : " + extras);
        System.out.println("Fours               : " + fours);
        System.out.println("Sixes               : " + sixes);

        System.out.println("----------------------------------------------");

        System.out.printf("Run Rate            : %.2f%n", runRate);
        System.out.println("Runs from Boundaries: " + boundaryRuns);
        System.out.println("Remaining Wickets   : " + remainingWickets);
        System.out.println("Score Status        : " + status);

        System.out.println("==============================================");
        System.out.println("      CRICKET SCORE ANALYSIS COMPLETE");
        System.out.println("==============================================");

        sc.close();
    }
}