package com.syntax.class01;

public class Greetings {
	
	Greetings()
	{System.out.println("hi");}
	Greetings(String name, int a){
		System.out.println(name+ a);
	}
	
	public static void main(String[] args) {
		
		Greetings greet=new Greetings();
		Greetings obj=new Greetings("name",12);
		System.out.println("hello");
	}}
		
		



	