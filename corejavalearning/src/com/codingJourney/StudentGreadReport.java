package com.codingJourney;
import java.util.Scanner;
public class StudentGreadReport {
//student Gread management system
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of subjects : ");
		int n=sc.nextInt();
		int total=0;
		int highest=Integer.MIN_VALUE;
	    int 	lowest=Integer.MAX_VALUE;
	  //read marks of each subject
		System.out.println("Enter the  marks : ");
		for(int i=1;i<=n;i++) {
			int marks=sc.nextInt();
			total +=marks;
			//find highest marks
			if(marks>highest) {
				highest=marks;
			}
			//find lowest marks
			if(marks<lowest) {
				lowest=marks;
			}
		}
		//calculating average of marks
		double average=total/n;
		//
		char gread;
		//Determine Greads
		if(average>=90) {
			gread='A';
			
		}else if(average>=80) {
			gread='B';
			
		}else if(average>=70) {
			gread='C';
			
		}else if(average>=60) {
			gread='D';
		}else if(average>=50) {
			gread='E';
		}else {
			gread='F';	
		}
// Display the result
System.out.println("------Student Gread Report------");
System.out.println("Total marks :"+total);
System.out.println("Average of marks: "+average);
System.out.println("Highest marks:"+highest);
System.out.println("Lowest Marks :"+lowest);
System.out.println("Gread: "+gread);
	//close Scanner		
		sc.close();   
	}
}
