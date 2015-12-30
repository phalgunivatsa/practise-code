package com.polymorphism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Trainee jack = new Trainee();
		Manager manager = new Manager();

		Security security = new Security();

		SwipeMachine swipeMachine = new SwipeMachine();
		// swipeMachine.loginTime(jack);

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Jack");
		list.add("Marting");
		list.add("Bob");
		list.add("Smith");
		
		Set<String> setOfEmployee = new HashSet<String>();
		list.add("Jack");
		list.add("Marting");
		list.add("Bob");
		list.add("Smith");

		swipeMachine.checkAllEmployee(list);
		swipeMachine.checkAllEmployee(setOfEmployee);
		
	}
}
