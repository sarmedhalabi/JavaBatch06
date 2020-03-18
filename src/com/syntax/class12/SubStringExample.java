package com.syntax.class12;

public class SubStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Mahady Hasan Rayhan";
		int i= name.indexOf("h");
		System.out.println(name.length());
		System.out.println(name.charAt(13));
		System.out.println(name.toUpperCase());
		System.out.println(name.equalsIgnoreCase("hasan"));
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(18-7));
		System.out.println(name.substring(13,19));
		System.out.println(name.contains("m"));
		String name2="Today is a rainy DAY";
		System.out.println(name2.substring(5,16));
		System.out.println(name2.substring(16));
		System.out.println(name.indexOf(" "));
	}

}
