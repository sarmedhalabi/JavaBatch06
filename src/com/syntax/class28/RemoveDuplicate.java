package com.syntax.class28;
import java.util.*; //   Adding the * will import everything implicitly. 

public class RemoveDuplicate {
	public static void main(String[] args) {
		System.out.println("===== Generic Collection======");
		List<String> Asia= new ArrayList<>();
		Asia.add("Iraq");
		Asia.add("Japan");
		Asia.add("China");
		Asia.add("turkey");
		Asia.add("Turkey");
		Asia.add("Nepal");
		System.out.println(Asia);
		for(int i=0;i<Asia.size();i++) { // For loop is not a good way to remove duplicate elements. 
			if(Asia.get(i).equalsIgnoreCase("turkey")) {
				Asia.remove(i);				
			}}   System.out.println(Asia);
			System.out.println("=======Using Iterator to remove duplicate====");
			Iterator<String> it= Asia.iterator();
			while(it.hasNext()) {
				if(it.next().equalsIgnoreCase("Turkey")) {
					
				}
				}
			System.out.println(Asia);
			System.out.println("=======");
			System.out.println("=== Non Generic Collection======");
			
			
			List<Object> Population= new LinkedList<>(Asia); // World is list that is filled with Asia
			Population.add(1, 38000000l);
		    Population.add(3,1270000000l);
		    Population.add(5,13000000000l);
		    Population.add(7,82000000000l);
		    Population.add(9,290000000l);
			System.out.println(Population);
			for(Object x:Population) {
				System.out.println(x);
			}
			
			
			
		
			
		
		
		
		
		
		
	}
	

}
