package com.yash.comparable; 

public class Student implements Comparable{
	int id;
	int age;
	String name;
	String city; 
 
	public Student(int id, int age, String name, String city) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.city = city;
	}




	@Override
	public int compareTo(Object object) {
		Student student=(Student) object;
		if(age==student.age)
			return 0;
		else if (age > student.age)
			return 1 ;
		else return 0;
	}
}	