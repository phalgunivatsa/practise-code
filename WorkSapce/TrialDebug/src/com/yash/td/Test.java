package com.yash.td;

import java.util.Scanner;

public class Test {
	int a;
	int b;
	
	
	public void sum(int a, int b){
		int c= a+b;
		System.out.println("the sum is "+c);
	}	
	public static void main(String[]args){
	Test test=new Test();
	test.sum(5, 6);
	}
	
}
