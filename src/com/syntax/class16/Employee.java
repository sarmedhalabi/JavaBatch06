package com.syntax.class16;

public class Employee {
	String name;
	int Id;
	double salary;
	static String CEO="Sumair";
	 
	public static void main(String[] args) {
		Employee obj1= new Employee();
		obj1.name="Sarmed";
		obj1.Id=12345;
		obj1.salary=1234.43;
		System.out.println(obj1.name+obj1.Id+CEO);
		
		obj1.name="Saif";
		System.out.println(obj1.name);
		
		System.out.println(CEO);
		
		
		
	}
	
	 
	
	

}
