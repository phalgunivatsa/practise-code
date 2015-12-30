package com.yash.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator {
	
		@Override
		public int compare(Object o1, Object o2) {
		Student s1= (Student) o1; 
		Student s2= (Student) o2;
		
		String name1= s1.getName();
		String name2 = s2.getName();
		return name1.compareToIgnoreCase(name2);
		
	}
		
		

}
