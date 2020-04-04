package com.syntax.class20_1;

import com.syntax.class20.Employee;

public class Waterfall  extends Employee {

	 	public static void main(String[] args) {

	 		Waterfall wteam=new Waterfall();
	 		Employee.company="Syntax";
	 		wteam.empNumber=124;// protected variables is visible to the child class in different Package
	 		//wteam.salary // CE: default is not visible

	 	}

}
