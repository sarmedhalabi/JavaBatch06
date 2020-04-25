package com.syntax.class29;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Cities {
	public static void main(String[] args) {
		ArrayList<String> cities= new ArrayList<>();
		cities.add("Baghdad");
		cities.add("Algeria");
		cities.add("Egypt");
		cities.add("Albania");
		cities.add("Iraq");
		Collections.sort(cities);
			
		
		System.out.println(cities);
		Object[] array= cities.toArray();
		Arrays.sort(array);
		
		System.out.println(array[3]);
		Iterator<String> it= cities.iterator();
		while(it.hasNext()) {
			String z=it.next();
			if(z.startsWith("A")) {
			it.remove();
			}
		}
		System.out.println(cities);
		
		
		
		
		
		
		
		
		
		
		
	}

}
