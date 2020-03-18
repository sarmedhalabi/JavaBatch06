package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		Scanner Java=new Scanner(System.in);
		System.out.println("Is there a sale?");
		String sale=Java.nextLine();
		
		if(sale.equals("Yes")) {System.out.println("what is the price?");
		double price=Java.nextDouble();
		double discount=0.0;
		double finalPrice=0.0;
				
				if (price<20) { discount=0.10*price;}
				else if (price>=20 && price<100) {discount=0.20*price;}
				else if (price>=100 &&price <=500) {discount=0.30*price;}
				else  {discount=0.50*price;}
				finalPrice= price-discount;
		
		}else {System.out.println("no going to shop");
		
		}
		
	}
		
		
		
		
		

	}
