package com.syntax.class19;

public class Names {
	Names(){
		System.out.println(" let start here");
	}
	Names(String str, String str2){
		this();
		System.out.println("I hopeyou are doing well");
		displayInfo();
	}
	void displayInfo() {
		System.out.println("hi");
	}
	Names(int a,int b, int c){
		this("hi","hello");
		System.out.println(" i am a good number");
	}
	public static void main(String[] args) {
		
		 Names sa=new Names(12,23,45);
		 Names Sa2= new Names("sarmed","Saif");
		
	}
	

}
