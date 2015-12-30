package com.yash.builderpattern.domain;

public class CakeBuilder {
	private Cake cake= new Cake();

	public CakeBuilder(double sugar,double butter, double flour, double bakingPowder) {
		super();

		this.cake.setSugar(sugar);
		this.cake.setButter(butter);
		this.cake.setFlour(flour);
		this.cake.setBakingPowder(bakingPowder);
	}
	
	public CakeBuilder() {
		// TODO Auto-generated constructor stub
	}

	public Cake bake(){
		return this.cake;
	}
	
}
