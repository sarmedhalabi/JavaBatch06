package com.syntax.class04;

import java.util.Scanner;

public class ExampleOfScanner {
 public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println("please enter any text");
	 String text=scan.nextLine();
	 System.out.println(text);
	 System.out.println("please enter any text");
	 int number=scan.nextInt();
	 System.out.println(number);
	 System.out.println("end of program");
	 String sarmed=scan.nextLine();
	 
	 System.out.println(sarmed+"java game");
	
}
}
