package com.syntax.class05;

public class LogicalAnd {
public static void main(String[] args) {
	int num= 178;
	if(num>=1 && num<=10) {System.out.println(" this is small");}
	else if (num>10 || num<=100) { System.out.println(" this is big number");}
	else if (num>100 && num<=1000) {System.out.println(" this is large");}
	else { System.out.println(" number is super large");}
}
}
