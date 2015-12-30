package com.yash.ejbproduct.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.yash.ejbproduct.domain.Product;

@ManagedBean
@SessionScoped
public class productBean {
	
	@PostConstruct
	public void init(){
		Product product= new Product();
		System.out.println("this is postConstruct");	
		List<Product> listOfProducts= new ArrayList<Product>();
	
		listOfProducts.add(new Product("Washing Machine" , "Whirlpool" , "Mumbai"));
		listOfProducts.add(new Product("Washing Machine" , "Whirlpool" , "Delhi"));
		listOfProducts.add(new Product("Washing Machine" , "Whirlpool" , "Chennai"));
		listOfProducts.add(new Product("Washing Machine" , "LG" , "Mumbai"));
		listOfProducts.add(new Product("Washing Machine" , "LG" , "Delhi"));
		listOfProducts.add(new Product("Washing Machine" , "LG" , "Chennai"));
		listOfProducts.add(new Product("Washing Machine" , "Hitachi" , "Mumbai"));
		listOfProducts.add(new Product("Washing Machine" , "Hitachi" , "Delhi"));
		listOfProducts.add(new Product("Washing Machine" , "Hitachi" , "Chennai"));
	
	
		listOfProducts.add(new Product("Microwave" , "Whirlpool" , "Mumbai"));
		listOfProducts.add(new Product("Microwave" , "Whirlpool" , "Delhi"));
		listOfProducts.add(new Product("Microwave" , "Whirlpool" , "Chennai"));
		listOfProducts.add(new Product("Microwave" , "LG" , "Mumbai"));
		listOfProducts.add(new Product("Microwave" , "LG" , "Delhi"));
		listOfProducts.add(new Product("Microwave" , "LG" , "Chennai"));
		listOfProducts.add(new Product("Microwave" , "Hitachi" , "Mumbai"));
		listOfProducts.add(new Product("Microwave" , "Hitachi" , "Delhi"));
		listOfProducts.add(new Product("Microwave" , "Hitachi" , "Chennai"));
	
	
		listOfProducts.add(new Product("Refrigerator" , "Whirlpool" , "Mumbai"));
		listOfProducts.add(new Product("Refrigerator" , "Whirlpool" , "Delhi"));
		listOfProducts.add(new Product("Refrigerator" , "Whirlpool" , "Chennai"));
		listOfProducts.add(new Product("Refrigerator" , "LG" , "Mumbai"));
		listOfProducts.add(new Product("Refrigerator" , "LG" , "Delhi"));
		listOfProducts.add(new Product("Refrigerator" , "LG" , "Chennai"));
		listOfProducts.add(new Product("Refrigerator" , "Hitachi" , "Mumbai"));
		listOfProducts.add(new Product("Refrigerator" , "Hitachi" , "Delhi"));
		listOfProducts.add(new Product("Refrigerator" , "Hitachi" , "Chennai"));
	
	
		Set setOfProducts = new TreeSet(listOfProducts);
	}
	

	
	
}
