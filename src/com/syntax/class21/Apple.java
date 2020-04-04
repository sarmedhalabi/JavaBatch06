package com.syntax.class21;

public class Apple {
	int x=12;
	void m1() {
		System.out.println(x);
	}

}
 class Orange extends Apple{
	void m1() {
		System.out.println("hi");
	}
	void name2() {
		super.m1();
		m1();
		
	}
}
