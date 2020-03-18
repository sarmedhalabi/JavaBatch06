package com.syntax.class12;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str= " Good morning class ";
char letter=str.charAt(2);
str=str.trim();
String str2=str+letter;
System.out.println(letter+ " "+ str2);
System.out.println(str.length());

for (int i=0;i<str.length();i++) {
	char letters=str.charAt(i);
	System.out.print(letters+ " ");}
	String name=" Hello world!";
	int index=name.indexOf("Good");
	System.out.println(index);
}
	}


