package com.cg.bookapp.service;

import java.util.List;
import com.cg.bookapp.model.Book;

public interface IBookService {

	public Book saveBook(Book book);
	public Book getById(int id);
	public Book getByAuthor(String authors);
	public Book updateBook(Book book);
	public void delteBook(int id);
	public List<Book> showAllBook();
	public List<String> showAllAuthors();	

}