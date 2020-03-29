package com.syntax.class19;

public class USA {
	String state, stateCapital;

 	public USA(String state, String stateCapital) {

 		this.state=state;
 		this.stateCapital=stateCapital;
 	}

 	public void displayState() {
 		System.out.println(state);
 	}

 	public void displayStateCapital() {
 		System.out.println(stateCapital);
 	}
 	static void country() {
 		int a=10,b=20;
 		int sum=a+b;
 		System.out.println(a+sum);
 	}

 	//can I call a method inside another method? --> YES
 	public void displayInfo() {
 		//this.displayState();
 		displayState();//by default compiler add this keyword to a method
 		displayStateCapital();
 		country();
 	}

 	public static void main(String[] args) {
 		USA state1=new USA("Texas", "Austin");
 		state1.displayInfo();
 	}}