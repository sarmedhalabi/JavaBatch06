package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
	System.out.println("enter your quiz score ");
	Scanner Java=new Scanner(System.in);
	int quiz=Java.nextInt();
	System.out.println("please enter midterm");
	int midterm=Java.nextInt();
	System.out.println("please enter final1");
	int final1=Java.nextInt();
	double average;
	average=((quiz+midterm+final1)/3);
	String grade1=null;
	
	
	if(average<70 && average>=0) {grade1="F";}
	else if(average>=70 && average<80) {grade1="C";}
	else if(average>=80 && average <90) {grade1="B";}
	else if(average>=90 && average <100) {grade1="A";}
	else {
	System.out.println("your grade is "+grade1);}
	System.out.println("your average is "+ average);
	

	
	
	
	
	
	
		

	}

}
