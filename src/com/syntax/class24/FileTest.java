package com.syntax.class24;

public class FileTest {
	public static void main(String[] args) {
		//File obj=new JavaFile();
	File[] total= {new JavaFile(),new PDF()};
for (int i=0;i<total.length;i++) {
	total[i].Close();
	System.out.println("------");
	total[i].edit();
	System.out.println("=========");
	total [i].open();
}}}


