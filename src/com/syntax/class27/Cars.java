package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Cars {
	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<>();
		cars.add("mecedes");
		cars.add("bmw");
		cars.add("passat");
		cars.add("toywota");
		//cars.removeAll(cars);
		//cars.clear();
		System.out.println(cars);
		for(String Car:cars) {
			System.out.println(Car);
		}
		System.out.println("===========");
		Iterator<String> x= cars.iterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
		System.out.println(cars);
	}

}
