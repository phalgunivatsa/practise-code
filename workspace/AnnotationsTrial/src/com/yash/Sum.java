package com.yash;

public class Sum {
	 Sum(){
		SumProcessor sumprocessor= new SumProcessor();
		sumprocessor.processSum(this); 
	 }
	
	@AnnotationForSum(value1=10,value2= 15)
	public void add(){
	}
}
