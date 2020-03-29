package com.syntax.class18;

public class Task {
	Task(){
		System.out.println("This is first constructor");
	}
	Task(String a){
		System.out.println("hi this is "+ a);
		
	}
	public static void main(String[] args) {
		Task obj=new Task();
		Task obj2=new Task("sarmed");
	}

}
