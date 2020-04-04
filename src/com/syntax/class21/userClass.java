package com.syntax.class21;

public class userClass {
	String name;
	int Mobilenumber;
	userClass(String name,int Mobilenumber){
		this .name=name;
		this.Mobilenumber=Mobilenumber;
	}
	void sarmed() {
		System.out.println(name+" "+ Mobilenumber);
		
	}
	}
	
	 class userInfo extends userClass{
		String Address;
		
		userInfo(String name,int Mobilenumber,String Address){
			
			super(name,Mobilenumber);
			this.Address=Address;
			
			}
			 public void Details() {
					System.out.println(name+ " "+ Mobilenumber+" "+ Address);
		}
		
	}
	
	


