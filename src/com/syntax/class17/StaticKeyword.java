package com.syntax.class17;

public class StaticKeyword {
	//create a template for a Phone
	 	String color;
	 	int memory;

	 	static String brand;
	 	static boolean touchScreen;

	 	//return type, name, parameters
	 	static void displayGeneralInfo() {
	 		System.out.println("We are building "+brand+" with touch screen="+touchScreen);
	 	}

	 	//instance members of the class can access ALL STATIC members
	 	void displaySpecifications() {
	 		System.out.println("We build "+brand +" with "+memory+"GB memory in "+color+" color");
	 	}

	 	//STATIC METHODS CANNOT ACCESS NON-STATIC MEMBERS OF THE CLASS
	 //	static void displaySpecifications1() {
	 //		System.out.println("We build phone with "+memory+"GB memory in "+color+" color");
	 //	}


	 	public static void main(String[] args) {
	 		//accessing static variables in a static way
	 		brand="iPhone";
	 		touchScreen=true;

	 		//accessing instance variables through the instance of the class
	 		StaticKeyword obj=new StaticKeyword();
	 		obj.color="grey";
	 		obj.memory=64;

	 		//accessing static method in a static way
	 		displayGeneralInfo();

	 		//accessing static method in non static way/through instance
	 		obj.displayGeneralInfo();//valid but not preferable
	 		obj.displaySpecifications();
	 		
	 		StaticKeyword.brand="Android";
	 		StaticKeyword.touchScreen=true;
	 		StaticKeyword.displayGeneralInfo();

	 		//access instance members of another class
	 		StaticKeyword sk=new StaticKeyword();
	 		sk.color="red";
	 		sk.memory=128;
	 		sk.displaySpecifications();

	 		StaticKeyword sk1=new StaticKeyword();
	 		sk1.color="red";
	 		sk1.memory=128;

	 		StaticKeyword sk2=new StaticKeyword();
	 		sk2.color="red";
	 		sk2.memory=128;
	 		sk2.brand="Nokia";// brand will change for all instances

	 		//not the right way access static method
	 		sk2.displayGeneralInfo();
	 		sk1.displayGeneralInfo();
	 		sk.displayGeneralInfo();
	 		displayGeneralInfo();
	 	}
	 }