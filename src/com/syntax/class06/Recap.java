package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int hour=90;
String timeOfDay=null;
if(hour>=1 &&hour <=11){
	timeOfDay="Morning";
	}
else if (hour >=12 && hour<=15) {
	timeOfDay="afternoon";
	}
else { 
	timeOfDay="Unknown";
	}


if(!timeOfDay.equals("Unknown")) {System.out.println("right now is "+timeOfDay);}

}
	}

	


