package com.syntax.class14;

public class Number {
	// Task 2 and Task 3
	void Numbers(int a)
	{ if(a%2==0) {
		System.out.println(a+ " is even number");}
	else if(a%2!=0) {System.out.println(a+ " is odd number");
	}

}
	void Palindrome(String name) {
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse= reverse+name.charAt(i);
		}
		if(name.equalsIgnoreCase(reverse)) {
			System.out.println(name+" is plaindrome");}
		else {System.out.println(name+" is not plaindrome");}
		}
	
	
		
			
			
			
		
		
	
	
	public static void main(String[] args) {
		Number num=new Number();
		num.Numbers(40);
		num.Palindrome("bob");
	}}
