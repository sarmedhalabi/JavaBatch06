package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class EntrySet {
	public static void main(String[] args) {
 		Map <String, String> land=new TreeMap<>();
 		land.put("Peru", "Lome");
 		land.put("Englad", "Kingston");
 		land.put("Iran", "Tehran");
 		land.put("italy", "Lima");
 		land.put("usa", "Havana");
 		System.out.println(land);

 		//storing all entry objects into a set 
 		Set<Entry<String,String>> allEntries=land.entrySet();
 		System.out.println(allEntries);

 		System.out.println("---loop through all entries to get a key and value");
 		for(Entry<String, String> entr:allEntries) {
 			String key=entr.getKey();
 			String value=entr.getValue();
 			System.out.println(key.toUpperCase()+"---"+value.toLowerCase());
 		}

 		System.out.println("---iterate through all entries to get a key and value");
 		Iterator<Entry<String, String>> entryIterator=allEntries.iterator();
 		while(entryIterator.hasNext()) {
 			Entry<String, String> e=entryIterator.next();
 			Object key$value = e.getKey()+":::"+e.getValue();
 			System.out.println(key$value);
 		}
	}

}
