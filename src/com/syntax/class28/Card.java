package com.syntax.class28;

public abstract class Card {
	final String  Name= "Capital One Bank";
	String cardType;
	protected Card(String cardType) {
		this.cardType=cardType;
	}
	protected  abstract void function();
	protected abstract void avaliability();
	public void cardName() {
		System.out.println(Name+" has a very good saving card option");
	}

}
class BankofAmerica extends Card{
	public BankofAmerica(String cardType) {
		super(cardType);
	}
	public void function() {
		System.out.println("Bank of America has"+cardType+" card type can make save lots of moeny");
	}
	public void avaliability() {System.out.println(" bank of america has lot of avalaibility");
}}
class CityBank extends Card{
	public CityBank(String cardType) {
		super(cardType);
	}
	protected void function() {
		System.out.println(" city bank can offer a "+cardType+" card type");
	}
	protected void avaliability() {
		System.out.println(" city bank has less cards avaliable than others");
	}
	
}
