package com.syntax.class12;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String name=" ahmed is good tester";
//String name1= name.replace("Ahmed", "sarmed");
//System.out.println(name1);
//String str=" PHone number is 12345678 $&**";
//str=str.replaceAll("[^0-9A-Za-z]","" );
//System.out.println(str);
//String sarmed=" ali is a great guy";
//sarmed=sarmed.replaceAll("[A-Za-z0-9]", "hi");
//System.out.println(sarmed);
//String saif="Hi how are you?";
//String Farah=" I am doing good";
//String ali= saif.substring(7,14)+Farah.substring(7,16);
//System.out.println(ali);
//
//
//}}
String me="I am a good tester";
		
		System.out.println("----- replace() FUNCTION -----");
		//replace old value with nee value
		String newString=me.replace("a", "c");
		System.out.println(newString);
		//if it finds matching char sequence --> then replace
		me=me.replace("good", "great");
		System.out.println(me);
		
		//if it is not finding matching sequence --> not replace
		me=me.replace("Great", "Awesome");
		System.out.println(me);
		
		String car="I have a Toyota";
		car=car.replace("Toyota", "Lexus");
		System.out.println(car);
		
		String str3="Hello all students";
		str3=str3.replace(" ", "");
		System.out.println(str3);
		
		System.out.println("----- replaceAll() FUNCTION -----");
		
		String str="Phone number is 1234567890";
		System.out.println(str);
		str=str.replaceAll("[A-Za-z]", "");
		
		System.out.println(str);
		
		String str1="Hello1234789";
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);
		
		String str2="Hello123^&^&^&*^!";
		str2=str2.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(str2);
		
		String subject="Java";
		
		subject=subject.replace("a", "e").replace("J", "I").toUpperCase();
		System.out.println(subject);
		System.out.println(subject.replaceFirst("E", "g"));
		
		//BREAK TILL 1:45
		
	}
}
