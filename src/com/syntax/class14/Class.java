package com.syntax.class14;

public class Class {
	void newLine(String name) {
		for (int i=0;i<=10;i++) {
			System.out.println(name);
		}
				
	}
	void xLine() {
		for(int i=0;i<=10;i++) {
			System.out.println("sarmed is good");
		}
	}
public static void main(String[] args) {
	Class x=new Class();
	x.newLine("Sarmed is a good programmer");
	x.xLine();
	
}
}
