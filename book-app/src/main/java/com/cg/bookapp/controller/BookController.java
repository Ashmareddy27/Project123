package com.cg.bookapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.cg.bookapp.model.Book;
import com.cg.bookapp.service.IBookService;

import net.bytebuddy.asm.Advice.OffsetMapping.ForSerializedValue;

@RestController
public class BookController {
	@Autowired
 IBookService service;
	
	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return service.saveBook(book);
	}
	@GetMapping("/books")
	public List<Book> allBook() {
		return service.showAllBook();
	}
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return service.updateBook(book);
	}
	
	@GetMapping("books/{bookId}")
	public Book getbyId(@PathVariable int bookId) {
		return service.getById(bookId);
	}
	@DeleteMapping( "/books/{bookId}")
	public void deleteBook(@PathVariable  int bookId) {
		service.delteBook(bookId);
	}
	
	@GetMapping("/book/{authors}")
	public Book getByAuthor(@PathVariable String authors) {
		return service.getByAuthor(authors);
	}
	
	@GetMapping("/books/authors")
	public List<String> favAuthors( ) {
		return service.showAllAuthors();
	}
	
	
	
	
	
}
