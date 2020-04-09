package com.syntax.class23;

public class ComputerTest {
public static void main(String[] args) {
	Computer apple=new Apple("read","code");
	Computer HP=new HP("read","code");
	
	Computer[] collection= {apple,HP};
	for (int i=0;i<collection.length;i++) {
		collection[i].display();
		collection[i].access();
		System.out.println("========");
		
	}
	HP student=new HP("READ","CODE");
	student.access();
	student.display();
}
}
