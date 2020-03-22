package com.syntax.class14;

public class Method {
	void sayWelcome(int times,String name) {
		for (int i=0;i<=times;i++) {
			System.out.println(name);
		}
	}
	void isRaining(boolean name) {
		if (name) {System.out.println("stay home");}
		else if(!name) {System.out.println("go for a walk");}
	}
	public static void main(String[] args) {
		Method test=new Method();
		test.sayWelcome(2,"Welcome");
		test.isRaining(false);
		
	}

}
