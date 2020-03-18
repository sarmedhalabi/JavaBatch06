package com.syntax.class01;

public class VariabeDeclaration {

	public static void main(String[] args) {
		//create a variable and store value
		// 1.declaring a variable and assigning a value
		boolean b=true;
		// 2 way: 1 step --> declare variable
		//          2 step--> assign value
		int i;
		i=1000;
		// declare multiple variables and assign value later
		char x, y, z; 
		x= 'A';
		y= '^';		
        z= '0';
        // we can not have variables with the same name in 1 program. 
        // double i=12.99; --> java will complain
        
        z='#'; //reassigning the value
        i=2000;
        System.out.println(i);
        System.out.println(z);
        int num=100;
        int num1=100;
        long num2=num1;
        
        System.out.println(num1);
        int saif=25%7;
         saif+=100;
         System.out.println(saif);
         String sami= "hello";
         if(sami) {System.out.println("mahady");}
         else {System.out.println("brain");}
         
         temp summer=75;
        
        
       
        
	}

}
