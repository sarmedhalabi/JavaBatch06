package com.syntax.class28;
import java.util.*;

public class CardTest {
	public static void main(String[] args) {
		List<Card> cards;
		cards=new LinkedList<>();
		cards.add(new BankofAmerica("savings"));
		cards.add(new CityBank("savings"));
		
		for (int i=0;i<cards.size();i++) {
			cards.get(i).avaliability();
			cards.get(i).cardName();
			cards.get(i).function();
			
			
		}
		
		Iterator<Card> it= cards.iterator();
		while(it.hasNext()) {
			Card x= it.next();
			x.avaliability();
			x.function();
			x.cardName();
			
		}
	}

}
