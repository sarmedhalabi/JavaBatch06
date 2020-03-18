package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {
public static void main(String[] args) {
	Scanner Java=new Scanner(System.in);
	System.out.println(" please enter sales");
	double sales=Java.nextDouble();
	double commission;
	if(sales>=1 && sales<=100) {
		//give user 10% comsission
		commission=sales*0.10;
	}else if (sales>100 &&sales<= 200) {
		commission=sales*0.2;
	}else if( sales>200 &&sales<=500){
		commission=sales*0.3;
	}else {commission=sales*0.5;}
	System.out.println("Based on your sales your comission is ="+ commission);
	if (commission>100) {System.out.println("you are awesome");}
}
		
	
	
	

}
