package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {
public static void main(String[] args) {
	
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println(" enter gender : M or F");
	char gender=scan.next().charAt(0);
	String genderType=null;
	switch(gender) {
	case 'M':
		genderType="Male";
		break;
	case 'F':
		genderType="female";
		default:
			genderType="Unknown";}
	System.out.println(" you gender is "+genderType);
	
		
	}
	
}

