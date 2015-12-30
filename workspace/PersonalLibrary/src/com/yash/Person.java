package com.yash;

public class Person {
	private int personId;
	private String nameOfPerson;
	private int numberOfBooks;
	
	public Person(int personId, String nameOfPerson, int numberOfBooks) {
		super();
		this.personId = personId;
		this.nameOfPerson = nameOfPerson;
		this.numberOfBooks = numberOfBooks;
	}
	
	public Person() {
		super();
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getNameOfPerson() {
		return nameOfPerson;
	}
	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}
	public int getNumberOfBooks() {
		return numberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}
}