package com.yash;

public class Book {
	private String titleOfBook;
	private String author;
	private int bookId;
	
	public Book(String titleOfBook, String author, int bookId) {
		super();
		this.titleOfBook = titleOfBook;
		this.author = author;
		this.bookId = bookId;
	}

	public Book() {
		super();
	}

	public String getTitleOfBook() {
		return titleOfBook;
	}

	public void setTitleOfBook(String titleOfBook) {
		this.titleOfBook = titleOfBook;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
}
	
	


