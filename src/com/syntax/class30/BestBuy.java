package com.syntax.class30;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class BestBuy {
	public static void main(String[] args) {
		Map<Long,String> bestBuy= new HashMap<>();
		bestBuy.put(23232232l,"tv");
		bestBuy.put(245423232l, "laptop");
		bestBuy.put(34383748378l,"radio");
		Set<Entry<Long,String>> entries= bestBuy.entrySet();
		for(Entry<Long,String> e: entries) {
			String keysvalues= e.getKey()+"=="+e.getValue();
			System.out.println(keysvalues);
			
					
			
			
		}
		Iterator<Entry<Long,String>> it= entries.iterator();
		while(it.hasNext()) {
			Entry<Long,String> x= it.next();
			System.out.println(x.getValue());
			System.out.println(x.getKey());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
