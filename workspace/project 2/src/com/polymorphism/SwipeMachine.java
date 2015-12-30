package com.polymorphism;

import java.util.ArrayList;
import java.util.Collection;

public class SwipeMachine {

	public void loginTime(Employee employee) {

		employee.getEmployeeType();
	}

	public void checkAllEmployee(Collection<String> listOfEmployee) {
		
		for(String str : listOfEmployee){
			System.out.println(str);
		}
	}
}
