package com.syntax.class14;

public class MethodReturning {
	int numbers(int a, int b) {
		int largest;
		if(a>b) {largest=a;}
		else {largest=b;}
		return largest;
		
	}
	boolean isOdd(int num) {
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;}
		else {isOdd=true;}
		return isOdd;
		}
	

	public static void main(String[] args) {
	String str="Hello World";
	int length=str.length();
	
	if(length>10) {System.out.println("string is long");}
	else {System.out.println("string is short");}
	
	
	MethodReturning max=new MethodReturning();
	int value=max.numbers(12, 55);
	System.out.println(value);
	boolean flag=max.isOdd(num);
	
	

	}

}
