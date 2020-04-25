package com.syntax.class30;

public class Person {
private String firstName;
private String lastName;
private double Salary;
private int age;

public Person(String firstName, String lastName, double Salary,int age) {
	this.firstName=firstName;
	this.lastName=lastName;
	this.Salary= Salary;
	this.age= age;}

public void display() {
	System.out.println("My name is "+firstName+lastName+" and I am "+age+" years old "+"and I am make "+Salary);


	
	
	
}

}
