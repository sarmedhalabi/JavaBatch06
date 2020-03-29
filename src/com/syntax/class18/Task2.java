package com.syntax.class18;

public class Task2 {
	String name;
	int grade1;
	int grade2;
	int grade3;
	
	public void average() {
		int average=(grade1+grade2+grade3/3);
		System.out.println(average+name);
	}
	Task2(String studentname, int a, int b, int c){
		name= studentname;
		grade1= a;
		grade2=b;
		grade3= c;}
	public static void main(String[] args) {
		Task2 obj=new Task2("ali",12,23,45);
		
		
		obj.average();
		

}}

