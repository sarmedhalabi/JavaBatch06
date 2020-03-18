package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {
public static void main(String[] args) {
	Scanner Java=new Scanner(System.in);
	System.out.println(" where are you from?");
	String country=Java.nextLine();
	String favoriteFood=null;
	switch(country.toLowerCase()) {
	case "morrocow":
		favoriteFood=" meat";
		break;
	case"iraq":
		favoriteFood="pottoe";
		break;
	case"usa":
		favoriteFood="burger";
	case"Iran":
		favoriteFood="Rice";
		break;
	default:
		favoriteFood="unknown";}
		
	System.out.println("your favorite food is "+ favoriteFood);
	
	}
	
}

