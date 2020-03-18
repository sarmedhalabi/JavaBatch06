package com.syntax.class12;

public class Examples {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		String name=" today is a great day";
//		String name1=name.replaceAll(" ", "");
//		System.out.println(name1);
		
		String name="HEllo12345$%&*";
		System.out.println(name.length());
		name=name.replaceAll("[A-Za-z]","");
		System.out.println(name);
		System.out.println(name.length());
		

	}

}
