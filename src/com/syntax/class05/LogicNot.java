package com.syntax.class05;

public class LogicNot {
public static void main(String[] args) {
	boolean b=!true;
	boolean val=!false;
	//NOT(!) -REVERSE THE CONDITION
	System.out.println(b);
	System.out.println(val);
	boolean isCold=false;
	if(!isCold) {System.out.println("Hello");}
	else {System.out.println("bye");}
	String day1="Tuesday";
	
	if(!day1.equals("Monday") && !day1.equals("Friday")) {System.out.println("Find me at syntax");}
	if(!(day1.equals("Monday") || day1.equals("Friday"))) {System.out.println("Find me at syntax");}
	
	
}
}
