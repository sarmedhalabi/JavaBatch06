package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
		
		String str1="Day";
		String str2="Night";
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
		
		
		

	}

}
