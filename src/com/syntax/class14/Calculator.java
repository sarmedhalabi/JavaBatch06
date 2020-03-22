package com.syntax.class14;

public class Calculator {
	void add(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
//	void sub(){
//		int a=20;
//		int b=40;  one way u can do it
	void sub(int a,int b) {
		
		System.out.println(b-a);
	}
	void div(double a, double b) {System.out.println(a/b);
		
	}
	void name(String a) {System.out.println(a);}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.add();
		cal.sub(100,200);
		cal.div(10,20.0);
		cal.name("sarmed");
		
		
	}

}
