package com.syntax.class10;

public class Task {
public static void main(String[] args) {
//	char[]grades={'A','B','C','D','E','F',};
//	getting all elements
//	for(int i=0; i<grades.length;i++) {
//		System.out.print(grades[i]);
//	int size=grades.length;
		
//		for(char grade:grades) {System.out.println(grade);}
//		
//	}
		String[]fruits= {"apple","orange","mango","kiwi"};
		int size= fruits.length;
//		System.out.println(fruits[size-1]);
//		System.out.println("---------");
//		for(String fruit:fruits) {System.out.println(fruit);}
//		System.out.println("==================");
//		for(int i=0; i<size;i++) {System.out.println(fruits[i]);}
		for(String fruit:fruits) {
			if(fruit.equals("apple")) {System.out.println(fruit+" is good");}
			else {System.out.println(fruit);}
		}
	
}
}


