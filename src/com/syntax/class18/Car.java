package com.syntax.class18;

public class Car {
	String make, model, color;
	int year;
	//Constructor 
	public Car() {
		make="BMW";
		model = "x5";
		color = "black";
		year = 2020;
		System.out.println(" this is a good car");
	}
	
	public void Details() {
		System.out.println("I have " + year + make + " " + model + " in " + color);
	}
	void hello() {
		System.out.println(" this is ana amzing car");
	}
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.year);
		car1.Details();
		car1.hello();
	}
}


