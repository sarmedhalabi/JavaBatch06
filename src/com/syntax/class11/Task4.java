package com.syntax.class11;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("----- isEmpty FUNCTION -----");
		// tells true if there is no characters inside the String
		// tells falls if any characters are inside the String
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
	
		System.out.println("----- trim() FUNCTION -----");
		//removes empty/white space at the begiining and end of the String
		String str4="   Welcome to Syntax!   ";
		
		str4=str4.trim();
		System.out.println("String with no leading or trailing spaces:"+str4);
	String sarmed="  ffdfddfdf";
	sarmed= sarmed.trim();
	System.out.println(sarmed);
	String saif="hi";
	String Farah= sarmed.concat(saif);
	System.out.println(Farah);
	
	
	}
}
