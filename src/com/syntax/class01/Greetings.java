package com.syntax.class01;

public class Greetings {
	
	
String name;
int year;
char symbol;
Greetings(){
	System.out.println("hi");
}


Greetings(String name, int year, char symbol){
	this.name=name;
	this.year=2020;
	this.symbol='A';
	System.out.println(name+year+symbol);}

void display(String a) {
	System.out.println(name+year+symbol);}
public static void main(String[] args) {
	Greetings s1=new Greetings("sarmed",2020,'A');
	s1.display("saif");
	s1=new Greetings();
	s1.display("saif");
	
}


}


		
		



	