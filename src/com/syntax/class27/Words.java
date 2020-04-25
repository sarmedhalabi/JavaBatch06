package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
	public static void main(String[] args) {
		ArrayList<String> words=new ArrayList<>();
		words.add("come");
		words.add("sell");
		words.add("hithere");
		words.add("sarmed");
		Iterator<String> word=words.iterator();
		while(word.hasNext()) {
			String x= word.next();
			if(x.endsWith("e")) {
				word.remove();
			}
			
			
			
		}
		System.out.println(words);
	}}
