package com.syntax.class12;

import java.util.Scanner;

public class HomeWork {
	
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter the browser name to proceed further with execution");
		    String browser = sc.nextLine(); 
		    if(browser.equalsIgnoreCase("ChRoME")) {
				    	System.out.println("Proceed with Chrome browseer");}
				    else if (browser.equalsIgnoreCase("FireFox")) {System.out.println("proceed with Firefox browser");}
				    else if(browser.equals("IE")) {System.out.println("Proceed with IE browser");}
				    else {System.out.println("Invalid browse");
				   
				    }
				    
				  }
				}
					   
		    
		 
		 