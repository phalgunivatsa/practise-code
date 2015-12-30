package com.yash.builderpattern.domain;

public class MyBuilderPattern {
	public static void main(String[]args){
		CakeBuilder cakeBuilder= new CakeBuilder(300, 200, 1000, 50);
		Cake cake=cakeBuilder.bake(); 
		
		System.out.println(cake);
	}
}
