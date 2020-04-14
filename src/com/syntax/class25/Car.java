package com.syntax.class25;

public class Car {
	double carPrice;
	String color;
	public Car(double carPrice, String color) {
		this.carPrice=carPrice;
		this.color=color;}
	public double calculateSalePrice() {
		
		return 0.0;
	}
}
class Truck extends Car{
	
	double weight;

	public Truck(double carPrice, String color, double weight){
		super(carPrice, color);
		this.weight=weight;
	}
	@Override
		public double calculateSalePrice() {
			double carDiscountPrice=0;
			if(weight>2000) {
				carDiscountPrice=carPrice-(carPrice*0.1);
			}else {
				carDiscountPrice=carPrice-(carPrice*0.2);
			}
			return carDiscountPrice; 
			}
}
		class Sedan extends Car{
		
			double length;
			public Sedan(double carPrice, String color, double length) {
				super(carPrice,color);
				this.length=length;
			}
		
			public double calculateSalePrice() {
				
				double sedanDiscountPrice=0;
				if(length>20) {
				sedanDiscountPrice=carPrice-(carPrice*0.5);
				}else {
					sedanDiscountPrice=carPrice-(carPrice*0.1);
				}
				return sedanDiscountPrice; 	
					
			}}
	