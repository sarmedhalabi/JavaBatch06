package com.syntax.class21;

public class ProgrammingLanguageTest {
	String name;
		String variable;
		ProgrammingLanguageTest(){
			System.out.println("hi");
		}

		public ProgrammingLanguageTest(String name, String variable) {
			this.name=name;
			this.variable=variable;
		}
}

class Java extends ProgrammingLanguageTest{
	Java(){}

	String constructor;

	Java(String name, String variable,String constructor){
		super(name, variable);
		this.constructor=constructor;
	}

	public void details() {
		System.out.println(name+" can have variables "+variable+" and constructor "+constructor);
	}

}
