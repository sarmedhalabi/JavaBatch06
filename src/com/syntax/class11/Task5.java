package com.syntax.class11;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
//		Scanner scan;
//        String username;
//        String password;
//        String confirmedPassword;
//        scan = new Scanner(System.in);
//        System.out.println("Please enter your username");
//        username = scan.nextLine();
//        System.out.println("Please enter your password");
//        password = scan.nextLine();
//        if (!(username.isEmpty() || password.isEmpty())) {
//            if (password.length() >= 8) {
//                if(!password.contains(username)) {
//                    System.out.println("Please confirm password");
//                    confirmedPassword=scan.nextLine();
//                    
//                    if(password.equals(confirmedPassword)) {
//                        System.out.println("Your account is created");
//                    }else {
//                        System.out.println("Passwords are not matched");
//                    }
//                }else {
//                    System.out.println("Password cannot contain username");
//                }
//            } else {
//                System.out.println("Password is too short");
//            }
//        } else {
//            System.out.println("Username and password cannot be empty");
//        }
//        String str="hi";
//        String str1= new String("hi");
//        String str2="hi";
//        String str3="HI".toLowerCase();
//        System.out.println(str3.toLowerCase());
//        if(str2==str) {System.out.println("this is String pool");}
//        else if(str3== str1){System.out.println("no way");}
//        else {System.out.println("cool");}
		String str="  Hello World";
		str=str.trim();
		System.out.println(str);
		String str1=" hi there ";
	boolean str2=str1.endsWith(" ");
	System.out.println(str2);
	String name="sarmed";
	boolean b= name.isEmpty();
	System.out.println(b);
	String a= name.concat(str);
	System.out.println(name.isEmpty());
	System.out.println(a);
	
				
		
        
   
        
	}
}
