package com.syntax.class10;

public class Task2 {
public static void main(String[] args) {
	String[] animals= {"lion","tiger","Dog","cat",};
//	for(int i=0;i<animals.length;i++) {System.out.print(animals[i]+ " ");}
//	for(String animal:animals) {System.out.print(animal+" ");}
//	
	int [] nums= {1, 2, 3, 4, 5, 6, 7, 8, 9};
	int total=0;
//	for (int i=0; i<nums.length; i++) {
//		total += nums[i];
//	}
//	System.out.println(total);
	
//	for (int num:nums) {
//		total+=num;
//		System.out.println(total);}
//	System.out.println(total);
//	
//	String[] countries= {"Bangladesh", "USA", "India", "Pakistan"};
//	String capital = null;
////	for(int i=0;i<countries.length;i++) {
////		if(countries[i].equals("Bangladesh")) {
//			capital="Dhaka";
//		}else if(countries[i].equals("USA")) {
//			capital="Washington DC";
//		}else if(countries[i].equals("India")) {
//			capital="New Delhi";
//		}else if(countries[i].equals("Pakistan")) {
//			countries[i]="Islamabad";
//		}else {
//			capital="unknown";
//		}
//System.out.println("The capital of "+countries[i]+" is "+capital+" ." );
	String [] countries= {"United States", "Russia", "Kazakhstan"};
	String [] caps= {"Washingtion DC", "Moscow", "Nur-Sultan"};
	for (int i=0; i<countries.length; i++) {
		System.out.println(countries[i]);
		}
	for (String cap:caps) {
		System.out.println(cap);
	}


	}
	
	
	
}

