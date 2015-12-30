package com.yash.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {
	
	public static void main(String [] args){
		Student student = null; 
		List listForComparison= new ArrayList();
		listForComparison.add(new Student(1, 20, "Phalguni", "Indore"));
		listForComparison.add(new Student(2, 11, "Manasi", "Jabalpur"));
		listForComparison.add(new Student(3, 39, "Shailee", "Ujjain"));
		
		Collections.sort(listForComparison);
		Iterator iterator= listForComparison.iterator();
		while (iterator.hasNext())
		student= (Student)iterator.next();
		System.out.println(student.id+"  "+student.name+"  "+student.city+"  "+student.age);
	}
}
