package com.yash;

import java.util.Scanner;

public class PLMMain {
	public static void main(String[] args) {
		Person person = new Person();
		Book book = new Book();
		MyLibrary mylibrary = new MyLibrary();

		System.out.println("1\tPress 1 to Add Person");
		System.out.println("2\tPress 2 to Add Books");
		System.out.println("3\tPress 3 to Remove Person");
		System.out.println("4\tPress 4 to Remove Books");
		System.out.println("5\tPress 5 to view all Books");
		System.out.println("Enter your choice");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();

		switch (choice) {
			case 1:{
				System.out.println("Enter your details:");
				mylibrary.addPerson();
				break;
			}
			case 2:{
				System.out.println("Enter the details of your book");
				mylibrary.addBook();
				break;
			}
			case 3:{
				System.out.println("Show all the people");
				mylibrary.showAllPerson();
				System.out.println("Enter the ID to remove a person:");
				int personId=scanner.nextInt();
				mylibrary.removePerson(personId);
				
			}
			case 5:{
				System.out.println("All the books are:");
				mylibrary.showAllBook();
				break;
			}
			default: System.out.println("Invalid choice");
		}
	}
}
		
		
		


