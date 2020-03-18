package com.syntax.class07;

public class LoopBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean rain=true;
		if(rain) {System.out.println("take umberalla");}// excute 1 time
		
		//while(rain) {System.out.println("take umberalla");// excute inifnite
		

	//}
		while(rain) {System.out.println("take umberalla");// excute 1 time
		rain=false; 
		}
		int z;
		int y=10;
		z=y++;// postincrement = first use the variable then increment.
		System.out.println(z);
		int w;
		int x=10;
		w=++x;// pre incrememnt= increment by noe first and then assign it by variable
		System.out.println(w);
}
}