package com.yash.builderpattern.domain;

public class Cake {
	private double sugar;
	private double butter;
	private double flour;
	private double bakingPowder;
	
	
	
	public Cake() {
		super();
		// TODO Auto-generated constructor stub
	}


	public double getSugar() {
		return sugar;
	}
	public void setSugar(double sugar) {
		this.sugar = sugar;
	}
	public double getButter() {
		return butter;
	}
	public void setButter(double butter) {
		this.butter = butter;
	}
	public double getFlour() {
		return flour;
	}
	public void setFlour(double flour) {
		this.flour = flour;
	}
	public double getBakingPowder() {
		return bakingPowder;
	}
	public void setBakingPowder(double bakingPowder) {
		this.bakingPowder = bakingPowder;
	}


	@Override
	public String toString() {
		return "Cake [sugar=" + sugar + ", butter=" + butter + ", flour=" + flour + ", bakingPowder=" + bakingPowder
				+ "]";
	}

	

	
	
	
	
}
