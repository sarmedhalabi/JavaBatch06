package com.syntax.class08;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner s;
		
		String item;
		double price;
		double money;
		double amount=0;
		double change;
		double remaining;
		s=new Scanner(System.in);
		System.out.println(" what are you buying");
		item=s.nextLine();
		System.out.println(" what is the price");
		price=s.nextDouble();
		do {System.out.println(" please give me payment");
		money=s.nextDouble();
		amount=amount+money;
		if(money<price) { remaining=price-money;
		System.out.println(" please give me more "+ remaining);
		}
	
		}
	}

}
