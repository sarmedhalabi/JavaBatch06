package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {
	public static void main(String[] args) {

 		// store flowers into array
 		Flower [] flowerArray={new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower")};

 		//store flowers into arraylist
 		ArrayList<Flower> flowers=new ArrayList<>();
 		flowers.add(new Rose("Rose"));
 		flowers.add(new Tulip("Tulip"));
 		flowers.add(new Sunflower("Sunflower"));
 		//System.out.println(flowers);
 		System.out.println("=======Advanced for loop===========");
		for (Flower a : flowers) {
			a.bloom();
		}
		System.out.println("=====Using For Loop========");
		for (int i = 0; i < flowers.size(); i++) {
			flowers.get(i).bloom();
		}
		System.out.println("=====Using Iterator========");
		Iterator<Flower> flower1 = flowers.iterator();
		while (flower1.hasNext()) {
			Flower x= flower1.next();
			x.bloom();
		}
	}

}
