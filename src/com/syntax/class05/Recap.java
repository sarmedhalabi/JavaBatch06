package com.syntax.class05;

import java.util.Scanner;

public class Recap {
public static void main(String[] args) {
	Scanner variable=new Scanner (System.in);
	System.out.println("Please enter your text");
	String text=variable.nextLine();
	System.out.println("Please enter any text");
	String text1=variable.next();
	System.out.println(text);
	System.out.println(text1);
	
	System.out.println("please enter any numbers");
	int num=variable.nextInt();
	System.out.println("Please enter decimal");
	double d=variable.nextDouble();
	System.out.println(num);
	System.out.println(d);
	System.out.println("Enter letter");
	char num1= variable.next().charAt(0);
	System.out.println(num1);
	
	
}
}
