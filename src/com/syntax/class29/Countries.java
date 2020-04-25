package com.syntax.class29;
import java.util.*;
public class Countries {
	public static void main(String[] args) {
		
	
	Set<String> countries= new TreeSet<>();
	countries.add("germany");
	countries.add("brazil");
	countries.add("Turkey");
	System.out.println(countries);
	for(String x: countries) {
		System.out.println(x);
	}
	
	

}
}