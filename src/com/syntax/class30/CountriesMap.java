package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class CountriesMap {
	public static void main(String[] args) {
		
	
	Map<String, String> countries= new TreeMap<>();
	countries.put("iraq","baghdad");
	countries.put("istanbul","turkey");
	countries.put("Paris", "frnace");
	System.out.println(countries.entrySet());
	System.out.println(countries.keySet());
	System.out.println(countries.values());
	for(String x:countries.keySet()) {
		System.out.println(x+" "+countries.get(x));
		
		
	}
	Iterator<String> it= countries.keySet().iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	for(String z:countries.values()) {
		
		System.out.println(z);
		
	}
	
	
	

}
}
