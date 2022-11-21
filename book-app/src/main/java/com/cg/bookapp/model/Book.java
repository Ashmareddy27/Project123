
package com.cg.bookapp.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity

public class Book {
@Id
	private int bookId;
@Column(nullable = false)
	private String bookTitle;
@Column(nullable = false)
	private String authors;
	private String bookDescription;
	private int yearOfPublication;
	
	
	public Book() {
		super();
		
	}


public Book(int bookId, String bookTitle, String authors, String bookDescription, int yearOfPublication) {
	super();
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.authors = authors;
	this.bookDescription = bookDescription;
	this.yearOfPublication = yearOfPublication;
}

public int getBookId() {
	return bookId;
}

public void setBookId(int bookId) {
	this.bookId = bookId;
}

public String getBookTitle() {
	return bookTitle;
}

public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}

public String getAuthors() {
	return authors;
}

public void setAuthors(String authors) {
	this.authors = authors;
}

public String getBookDescription() {
	return bookDescription;
}

public void setBookDescription(String bookDescription) {
	this.bookDescription = bookDescription;
}

public int getYearOfPublication() {
	return yearOfPublication;
}

public void setYearOfPublication(int yearOfPublication) {
	this.yearOfPublication = yearOfPublication;
}


@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", authors=" + authors + ", bookDescription="
			+ bookDescription + ", yearOfPublication=" + yearOfPublication + "]";
}

	
}