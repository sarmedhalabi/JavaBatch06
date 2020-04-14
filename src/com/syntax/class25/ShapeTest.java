package com.syntax.class25;

public class ShapeTest {
	public static void main(String[] args) {
		//Shape obj=new Shape(); can not instantiate
	//Shape str=new Shape();	
	Shape obj=new Circle();
	Shape obj1=new Square();
	Shape[] totalObj= {obj,obj1};
	for(Shape x:totalObj) {
		System.out.println(x.CalculateArea(20.0));
		System.out.println(x.CalculatePerimeter(20.0));
		System.out.println("=======");
		
	}
	
	}

}
