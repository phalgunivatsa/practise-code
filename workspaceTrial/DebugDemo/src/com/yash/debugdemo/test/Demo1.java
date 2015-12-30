package com.yash.debugdemo.test;

public class Demo1 {

	private String name;
	private int id;

	public Demo1() {
		// TODO Auto-generated constructor stub
	}

	public Demo1(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	 
	 
	@Override
	public String toString() {
		return "Demo1 [name=" + name + ", id=" + id + "]";
	}

	public void print() {
		System.out.println("-------Print Method Called--------");
		printSquare();
		System.out.println("-------Print Method Exits--------");
	}

	public void printSquare() {
		int i;
		for (i = 2; i < 10; i++) {
			System.out.println("The square of " + i + " is " + i * i);
		}
	}
}