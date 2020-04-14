package com.syntax.class25;

public  abstract class Marks {
	public abstract double getPercentage();
}
class StudentA extends Marks{
double math,chem,bio;

	StudentA(double math,double chem,double bio){
		this.math=math;
		this.chem=chem;
		this.bio=bio;}
	
	public double getPercentage() {
	double getAverage= (math+chem+bio/3)*0.01;
	
	return getAverage;
	}
}
class StudentB extends StudentA{
	double phys;
	
	StudentB(double math,double chem,double bio,double phys){
		super(math,chem,bio);
		this.phys=phys;
	}
public double getPercentage() {
	double getAverage= (math+chem+bio+phys/4)*0.01;
	return getAverage;
	}

}


	


