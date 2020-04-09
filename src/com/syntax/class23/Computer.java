package com.syntax.class23;

public class Computer {
	String read;
	String code;
	Computer(String read, String code){
		this.read=read;
		this.code=code;
	}
	public void display() {
		System.out.println("computer can "+ read+"and "+code);
	}
	void access() {
		System.out.println(" computers can access");
	}

}
class Apple extends Computer{
	
	Apple(String read,String code){
		super(read,code);
	}
	public void display() {
		System.out.println(" Apple has great "+ read+ code);
	}
	protected void play() {
		System.out.println(" apple can play");
	}
	
}
class HP extends Computer{
	HP(String read, String code){
		super(read,code);
	}
}
