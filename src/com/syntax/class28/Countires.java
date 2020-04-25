package com.syntax.class28;
import java.util.*;

public class Countires {
	public static void main(String[] args) {
		List<String> Europe;
		Europe=new LinkedList<>();
		
		Europe.add("England");
		Europe.add("Italy");
		Europe.add("England");
		Europe.add("Spain");
		Europe.add("Croatia");
		Europe.add("Spain");
		Europe.add("France");
		System.out.println(Europe);
		List<String> World= new LinkedList<>();
	for(int i=0;i<Europe.size();i++) {
			if(!World.contains(Europe.get(i))) {
				World.add(Europe.get(i));
			}
		}
		System.out.println(World);
//	Iterator<String> it= Europe.iterator();
//	while( it.hasNext()) {
//		if(!World.contains(it.next())){
//			World.add(it.next());
//		}
//	
//	}
	}}
			
			