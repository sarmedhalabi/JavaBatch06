package com.syntax.class30;
//h.w 4,5

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HW4 {
	public static void main(String[] args) {
		Set<String> words= new LinkedHashSet<>();
		words.add("I");
		words.add("miss");
		words.add("my family");
		words.add("a lot");
		words.add("a lot");
		System.out.println(words); // print out the set collection.
		Iterator<String> it= words.iterator();
		while( it.hasNext()) {
			String x = it.next();
			System.out.print(x+" ");
		}
		System.out.println("======");
		int sum=0;
		
		List<Integer> numbers= new LinkedList<>();
		numbers.add(10);
		numbers.add(12);
		numbers.add(10);
		numbers.add(40);
		numbers.add(32);
		Iterator<Integer> it2= numbers.iterator();
		while(it.hasNext()) {
			sum+=it2.next();
		}
		System.out.println(sum);
		
		
	}}
		
		
		
		
		
		
		