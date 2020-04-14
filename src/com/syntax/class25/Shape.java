package com.syntax.class25;

public  interface Shape {
double CalculateArea(double r);
double CalculatePerimeter( double r);

}
 class Circle implements Shape{
	
	public double CalculateArea(double r) {
		double Area= 3.14*r*r;
		return Area;
		
		
	}
	public double CalculatePerimeter(double r) {
		double perimeter=2*3.13*r;
		return perimeter;
	}
		
	}
class Square implements Shape{
	//String name1="Square";
	public double CalculateArea(double r) {
		double AreaofSquare= r*r;
		return AreaofSquare;
		//System.out.println(" Calculate the Area of "+ name1);
	}
	public double CalculatePerimeter(double r) {
		//System.out.println("calculating perimeter of "+name1);
	double perimeterOfSquare= 4*r;
	return perimeterOfSquare;
	}
	
}

