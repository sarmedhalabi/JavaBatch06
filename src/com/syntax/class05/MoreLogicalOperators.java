package com.syntax.class05;

import java.util.Scanner;

public class MoreLogicalOperators {
	public static void main(String[] args) {
		/*
		 * we have total 7 days in a week if day is 2 or 3 ---> SDLC class if day 6,7-->
		 * java class if day 1,5---> off day if day 4---> review class
		 */
		Scanner Java = new Scanner(System.in);
		int day = Java.nextInt();
		;
		if (day == 2 && day == 3) {
			System.out.println("Today is sdlc class");
		}
		else if (day == 6 || day == 7) {
			System.out.println(" today is java");}
	
		else if (day == 7) {
			System.out.println(" today is review");
		} else if (day == 1 && day == 5) {
			System.out.println(" there is no class");
		} else {
		
		System.out.println(" invalid day");}
			System.out.println("=====using string=====");
			Scanner Input=new Scanner(System.in);
			
			String day1=Input.nextLine();
			if (day1.equals("Tuesday")|| day1.equals("Wednesday")){System.out.println(" today is sdlc");}
			else if (day1.equals("Satruday") || day1.equals("sunday")) {System.out.println("today is java");}
			else {System.out.println("Monday");}
	
			
			

		

	}
}
