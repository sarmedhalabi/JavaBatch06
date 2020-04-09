package com.syntax.class18;

public class Recap {
Recap(){
	System.out.println(" learning constuctor");
}
protected int sumFromArray(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
			
		}
		int average= total/a.length;
		return average;
		
	}

	public static String getReverse(String str) {
		String reverse="";
		for ( int i=str.length()-1; i>=0; i--) {
			reverse+=str.charAt(i);
		}
		return reverse;
	}

	private static String getVowels(String str) {
		String vowels;
		vowels = str.replaceAll("[^aeiouAEIOU]","");
		return vowels;
	}

	public static void main(String[] args) {
		Recap obj = new Recap();
		int[] a = { 2, 7, 19, 857 };
		System.out.println("total: " + obj.sumFromArray(a));

		String str=Recap.getReverse("Hello");
		System.out.println(str);
		System.out.println(getReverse("Good"));

		String vowels=getVowels("Hello");
		System.out.println(vowels);
	}

}
