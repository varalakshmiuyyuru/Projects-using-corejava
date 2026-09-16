package com.day41to60;
import java.util.Scanner;
public class SimpleChatLoginValidation {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "Varalakshmi";
        String correctPassword = "Java@123";
        System.out.println("===== Simple Chat Login Validation =====");
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.println("\n----- Login Result -----");
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Username       : " + username);
            System.out.println("Password       : Valid");
            System.out.println("Login Status   : Successful");
            System.out.println("Access         : Granted");
            System.out.println("Message        : Welcome to the chat!");
        } else {
            System.out.println("Username       : " + username);
            System.out.println("Login Status   : Failed");
            System.out.println("Access         : Denied");
            if (!username.equals(correctUsername)) {
                System.out.println("Reason         : Invalid username.");
            }
            if (!password.equals(correctPassword)) {
                System.out.println("Reason         : Invalid password.");
            }
        }
        System.out.println("\n----------------------------------------");
        System.out.println("Chat login validation completed.");
        System.out.println("----------------------------------------");
        sc.close();
    }
}