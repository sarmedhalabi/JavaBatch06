package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {
public static void main(String[] args) {
	int num=1;
	Scanner Java= new Scanner(System.in);
	while(num<=5) {
	System.out.println(" what is your name");
	
	String name=Java.nextLine();
	System.out.println(" good afternoon "+ name);
	num++;
	
	
}
}
}