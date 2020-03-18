package com.syntax.class04;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sarmed = new Scanner(System.in);
		System.out.println(" what is the amount of loan you need");
		int num1 = Sarmed.nextInt();
		System.out.println("the amount of loan is " + num1);
		if (num1 <= 2000000) {
			System.out.println("lend the moeny");
		} else if(num1>2000000) {
			System.out.println("reject the clinet");
		}

		
	}

}
