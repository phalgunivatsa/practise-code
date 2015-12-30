package com.yash;

 class Example<E> {
	E element;
	Example(E e) {
		element= e;
	}
	
	public E getElement(){
		return element;
	}
}

public class GenericsExample{
	public static void main(String[] args) {
	Example<String>example= new Example("hello");
	String string= example.getElement();
	System.out.println(string);
	
	Example<Integer>example2= new Example(25);
	Integer integer= example2.getElement();
	System.out.println(integer);
	} 
}		
	
