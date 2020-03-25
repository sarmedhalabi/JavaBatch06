package com.syntax.class14;

import java.util.Scanner;

public class Practice {

//		 public static int sumEvenTox(int x){
//			   int sum=0;
//			   for(int i=1;i<=x;i++){
//			     if(i%2==0){
//			       sum=sum+i;
//			       
//			     }
//			     
//			   }
//			   return sum;
//			  }
//			  public static void main(String [] args){
//			    Class numbers=new Class();
//			    int num=numbers.sumEvenTox(8);
//			    System.out.println(num);
//			  }}
//		void firstName() {
//			System.out.print("John");
//		}
//		void lastName() {
//			System.out.print("Smith");
//		}
//		void emailType(){
//			System.out.print("@gmail.com");
//		}
//		public static void main(String[] args) {
//			Class email=new Class();
//			email.firstName();
//			email.lastName();
//			email.emailType();
//			
//		}}
	//
//		public static String Email() {
//			Scanner java=new Scanner(System.in);
//			System.out.println("what is your first");
//			String first=java.nextLine();
//			System.out.println("what is your last");
//			String last=java.nextLine();
//			System.out.println("what is your email type");
//			String emailtype=java.nextLine();
//			String name=first.concat(last).concat(emailtype);
//			return name;}
//		public static void main(String[] args) {
//			Practice email=new Practice();
//			String sarmed=email.Email();
//			System.out.println(sarmed);
//		}
//			
//		}
//			
	public static boolean number(int a) {
		boolean prime=false;
		if (a > 1) {
			for (int i = 2; i <= a; i++) {
				if (a % i != 0) {
					prime = true;
				} else {
					prime = false;
				}
			}

		}
		return prime;
	}

	public static void main(String[] args) {
		Practice prime = new Practice();
		boolean isPrime = prime.number(11);
		System.out.println(isPrime);

	}
}
//	public static void main(String[] args) {
//		
//	
//	int given = 11;
//		boolean isPrime=true;
//
//		if(given>1) {
//			for(int i=2; i<given; i++) {
//				if(given%i==0) {
//					isPrime=false;
//					break;
//				}
//			}
//
//		}
//		System.out.println("Given number "+given+" is prime? "+isPrime);
//
//	}
//}
//
//
