package com.syntax.class24;

public  abstract class File {
	protected void open() {
		System.out.println("Open this file");
	}
	public abstract void Close();
	public abstract void edit();
}
class JavaFile extends File{
	public void open() {
		System.out.println("JavaFile will open this");
	}
	public void Close() {
		System.out.println("Java close");}
		public void edit() {
			System.out.println(" we need notepad");
		}
		
	}
	class PDF extends File{
		public void open(){
			System.out.println(" PDF open");
		}
		public void Close() {
			System.out.println(" PDF close");
		}
		public void edit() {
			System.out.println("PDF edit");
		}
		
	}
	
	
	


	


