package com.syntax.class06;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner Java=new Scanner(System.in);
		System.out.println(" what is your grade?");
		char grade=Java.next().charAt(0);
		String comment;
		switch(grade) {
		case'A':
			comment="excellent";
			break;
		case'B':
			comment="good";
			break;
		case'C':
			comment="Bad";
			break;
			default:
				comment="crazy bad";}
		System.out.println("you grade is "+ comment);
		
		
		
		
			
		
		

	

	}
}
