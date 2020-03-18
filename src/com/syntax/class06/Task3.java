package com.syntax.class06;

import java.util.Scanner;

public class Task3 {
public static void main(String[] args) {
	Scanner Java=new Scanner(System.in);
	System.out.println("Enter two number");
double num1=Java.nextDouble();
double num2=Java.nextDouble();
double result=0.0;
System.out.println("Enter an operator");
char num=Java.next().charAt(0);
switch(num) {
case('+'):
	result=num1+num2;
break;
case('-'):result=num1-num2;
break;
case('/'):result=num1/num2;
break;
case('*'):result=num1*num2;
default: System.out.println( "result is out of range");return;}


System.out.println(num1+num+num2+ "="+result);



}
}
