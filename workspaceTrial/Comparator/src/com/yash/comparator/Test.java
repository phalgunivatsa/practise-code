package com.yash.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String [] args){
		List listToCompare= new ArrayList();
		listToCompare.add(new Student(1, "Phalguni", "Ujjain"));
		listToCompare.add(new Student(2, "Aadya", "Indore"));
		listToCompare.add(new Student(3, "Honey", "Dhar"));
		
		System.out.println("-------------------Sorting by name----------------");
		
		Collections.sort(listToCompare, new NameComparator());
		Iterator it= listToCompare.iterator();
		while(it.hasNext()){
			Student student= (Student)it.next();
			System.out.println(student.getId()+"-----"+student.getName()+"-----"+student.getCity());
		}
	}


}
