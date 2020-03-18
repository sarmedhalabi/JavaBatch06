package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {
public static void main(String[] args) {
	Scanner Java=new Scanner(System.in);
	int age;
	System.out.println("Please enter your age?");
	age=Java.nextInt();
	if(age>=0 && age<3) {System.out.println("you are a baby");}
	else if (age>=3 && age<=5) {System.out.println("you are a kid");}
	else if (age>=6 && age<=12) {System.out.println(" you are a child");}
	else if (age>=20 && age<65) {System.out.println(" you are an adult");}
	else {System.out.println("you are enjoying your life");}
	
	
}
}
