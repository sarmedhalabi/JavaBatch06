package com.syntax.class28;
import java.util.*;

public class RemoveElments {
	public static void  Remove (List<String> newCountries){
		Iterator<String> it= newCountries.iterator();
		while(it.hasNext()) {
			if(it.next().equals("USA")) {
				it.remove();
			}
		}
		
		System.out.println(newCountries);
	}
	public static void main(String[] args) {
		List<String> newCountries = new LinkedList<>();
		newCountries.add("Armenia");
		newCountries.add("USA");
		newCountries.add("Kazakhstan");
		newCountries.add("Australia");
		newCountries.add("Pakistan");
		newCountries.add("Russia");
		newCountries.add("Azerbaijan");
		Remove(newCountries);
		
		
		
	}
	

}
