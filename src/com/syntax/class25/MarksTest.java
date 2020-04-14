package com.syntax.class25;

public class MarksTest {
	public static void main(String[] args) {
		Marks studentA=new StudentA(70,89,90);
		System.out.println(studentA.getPercentage());
		System.out.println("========");
		Marks studentB=new StudentB(80,88,90,77);
		System.out.println(studentB.getPercentage());

}}