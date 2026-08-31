package com.codingJourney;

import java.util.Scanner;

public class EmployeeAttendanceCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========== EMPLOYEE ATTENDANCE CALCULATOR ==========");

        System.out.print("Enter Employee Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Total Working Days : ");
        int workingDays = sc.nextInt();

        System.out.print("Enter Days Present : ");
        int presentDays = sc.nextInt();

        System.out.print("Enter Days Absent : ");
        int absentDays = sc.nextInt();

        double attendancePercentage =
                (double) presentDays / workingDays * 100;

        String status;

        if (attendancePercentage >= 75) {
            status = "Eligible";
        } else {
            status = "Not Eligible";
        }

        System.out.println("\n=============== ATTENDANCE REPORT ===============");

        System.out.println("Employee Name       : " + name);
        System.out.println("Working Days        : " + workingDays);
        System.out.println("Days Present        : " + presentDays);
        System.out.println("Days Absent         : " + absentDays);

        System.out.printf("Attendance          : %.2f%%%n",
                attendancePercentage);

        System.out.println("Attendance Status   : " + status);

        System.out.println("---------------------------------------------------");
        System.out.println("Employee Attendance Analysis Completed");
        System.out.println("===================================================");

        sc.close();
    }
}