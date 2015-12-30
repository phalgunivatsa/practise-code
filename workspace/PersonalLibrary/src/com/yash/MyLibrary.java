package com.yash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MyLibrary {
	Person person = new Person();
	Book book = new Book();

	Set<Person> persons = new HashSet<Person>();
	Set<Book> books = new HashSet<Book>();
	Scanner scanner=new Scanner(System.in);
	
	public void checkOut() {

	}

	public void checkIn() {

	}

	public void removePerson(int personId) {

	}

	public void addBook() {
		System.out.println("Enter the title of your book");
		String titleOfBook=scanner.nextLine();
		System.out.println("Enter the author of the book");
		String author=scanner.nextLine();
		System.out.println("Enter the id of book");
		int bookId=scanner.nextInt();
		books.add(new Book(titleOfBook, author, bookId));
	}

	public void removeBook() {

	}

	public void getAvailableBooks(int personId) {
		
		

	}

	public void availableBooks() {

	}

	public void addPerson() {
		System.out.println("Enter your id:");
		int personId= scanner.nextInt();
		System.out.println("Enter your name:");
		String nameOfPerson= scanner.nextLine();
		System.out.println("Enter the maximum number of books that you have");
		int numberOfBooks= scanner.nextInt();
		persons.add(new Person(personId, nameOfPerson, numberOfBooks));
	}

	public void displayPerson() {

	}

	public void showAllBook() {
		for(Book b:books){
			System.out.println("Book id:"+book.getBookId()+"\n" +"Name of the book:"+book.getTitleOfBook()+"\n"+"Author of book:"+book.getAuthor());
		}
		
	}

	public void showAllPerson() {
		for(Person p:persons){
			System.out.println("Person id:"+person.getPersonId()+"\n"+"Name of Person:"+person.getNameOfPerson()+"\n"+"Number of books the person has:"+person.getNumberOfBooks());
		}
		
	}

}
