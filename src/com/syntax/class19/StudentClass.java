package com.syntax.class19;
// task 1

public class StudentClass {
	String name;
	int address;
	public StudentClass(String name, int address){
		this.name=name;
		this.address =address;
	}
	public void Studentinfo() {
		System.out.println(name+" "+address);
	}
	public static void main(String[] args) {
		StudentClass student1=new StudentClass("Johan",12345);
		student1.Studentinfo();
	}

}
