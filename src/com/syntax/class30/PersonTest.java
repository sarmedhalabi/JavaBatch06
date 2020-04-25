package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class PersonTest {
	public static void main(String[] args) {
		Person person1= new Person("Jhon","Smith",80000.0,35);
		Person person2=new Person("Adam","Smith",90000.0,37);
		Person person3=new Person("David","Smith",1000000.0,40);
		Map<Integer,Person> person=new TreeMap<>();
		person.put(101, person1);
		person.put(301, person2);
		person.put(201, person3);
		Collection<Person> values= person.values();
		for(Person value:values) {
			value.display();
		}
		System.out.println("Iterator=====");
		Iterator<Person> itValues= values.iterator();
		while(itValues.hasNext()) {
			itValues.next().display();
		}
		System.out.println("--------");
		Set<Integer> keys= person.keySet();
		for(Integer x: keys) {
			//System.out.println(x);
			Person z=person.get(x);
					z.display();
		}
		Iterator<Integer> itKeys= keys.iterator();
		while(itKeys.hasNext()) {
			
			person.get(itKeys.next()).display();
		}
		System.out.println("==========EntrySet");
		Set<Entry<Integer,Person>> entries= person.entrySet();
		for(Entry<Integer,Person> z: entries) {
			z.getValue().display();
		}
		System.out.println("========================");
		Iterator<Entry<Integer,Person>> it4= entries.iterator();
		while(it4.hasNext()) {
			Entry<Integer,Person> name= it4.next();
			System.out.println(name.getKey());
			name.getValue().display();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
