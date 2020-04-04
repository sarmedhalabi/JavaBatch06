package com.syntax.class17;

public class Employee {
	public  static String name;
	  String city;
	  protected String nameoftheschool;
	  private int batchnumber;
	  static void Id2() {
		  System.out.println("i live in "+name);
	  }
	  void Id(){
	    System.out.println("my name is "+name+" and I live in "+city+" I study at "+nameoftheschool+ " in batch "+batchnumber);
	  }
	  public static void main(String [] args){
	    Employee obj=new Employee();
	    obj.name="John";
	    obj.city="Miami";
	    obj.nameoftheschool="Syntax";
	    obj.batchnumber=6;
	    obj.Id();
	   obj.Id2();
	   Id2();
	  }
	  

	  
	}