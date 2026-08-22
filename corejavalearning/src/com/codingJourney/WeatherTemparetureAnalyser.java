package com.codingJourney;

import java.util.Scanner;

public class WeatherTemparetureAnalyser {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter present Temapreture : ");
	int tempareture=sc.nextInt();
	if(tempareture>=35 ||tempareture<15) {
	System.out.println("Alert :Temperature is outside the not safe range!");
	}else if(tempareture <=30 ||tempareture>=15){
		System.out.println("Tempareture is normal");
	}else {
		System.out.println("Enter valid Tempareture");
	}
	sc.close();
	}

}
