package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 10;
		System.out.println(d);//10.0
		//int i=10.99; //not possible --> compile time error saying
		//type mismatch, can not convert double to int.
		// casting in java is a conversion of 1 type into another type.
		int i =(int)10.99;
		System.out.println(d);
		System.out.println(i);
		//byte b=128;  it won't work , too big.
		byte b=(byte)1254; // byte goes from -128 to 127
		System.out.println(b);
		double s= 12;
		s-=4;
		System.out.println(s);
		System.out.println(i);
		double sarmed=(double)145;
		int farah= (int) 145.000;
		double omar=500.00;
		long ali= (long)omar;
		System.out.println(ali);
		float Sami= 2323;
		byte samir= (byte)Sami;
		System.out.println(samir);
		System.out.println(Sami);
		
		
		System.out.println(farah);
		
		

	}

}
