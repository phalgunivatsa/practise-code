package com.yash.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import com.yash.dao.CustomerDao;
import com.yash.domain.Customer;

public class Presentation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("1. Enter Customer Record");
		System.out.println("2. Enter Customer for Delete Record");
		System.out.println("3. Display all customers");
		System.out.println("4. Update a record in Customer");

		int decision = scanner.nextInt();
		
	
		switch (decision) {
			case 1: {
				System.out.println("Enter the id of customer");
				int id = scanner.nextInt();
			
				System.out.println("Enter the name of Customer");
				String name = scanner.next();

				System.out.println("Enter the Address of Customer");
				String address = scanner.next();

				Customer customer = new Customer();
				customer.setName(name);
				customer.setAddress(address);
				customer.setId(id);

				CustomerDao customerdao = new CustomerDao();
				customerdao.save(customer);
			break;
				}
			
			case 2: {
				System.out.println("Enter Customer ID To delete record");
				int customerId = scanner.nextInt();
				Customer customer = new Customer();
				customer.setId(customerId);
				CustomerDao customerDao = new CustomerDao();
				customerDao.delete(customer);
			break;
				}
			case 3:{
				System.out.println("The Customers are :");
				Customer customer=new Customer();
				CustomerDao customerdao=new CustomerDao();
				ArrayList<Customer> allCustomer= customerdao.getAllCustomers();
			
				for(Customer customer1: allCustomer){
					System.out.println(customer1);
					}
			break;
				}
			case 4:{
				System.out.println("Enter the customer Id to update record");
				int customerId=scanner.nextInt();
				Customer customer=new Customer();
				customer.setId(customerId);
				System.out.println("Enter new Address");
				String Address=scanner.next();
				CustomerDao customerDao= new CustomerDao();
				customerDao.update(customerId, Address);
			break;
				}
			}
		}
	}
}
