package com.cg.bookapp.service;

import java.util.List;

import org.hibernate.DuplicateMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bookapp.exception.AuthorNotFoundException;
import com.cg.bookapp.exception.BookNotFoundException;
import com.cg.bookapp.exception.DuplicateValueException;
import com.cg.bookapp.model.Book;

import com.cg.bookapp.repository.IBookRepository;
@Service
public class BookServiceImpl implements IBookService {
	@Autowired
  private IBookRepository repo;
	
  
	@Override
	public Book saveBook(Book book) {
		if(repo.existsById(book.getBookId())) {
			throw new DuplicateValueException("Book is already there");
		}
		return repo.save(book);
	}

	@Override
	public Book getById(int id) {
		return repo.findById(id).orElseThrow(()->new BookNotFoundException("Invalid ID  :"+id));
	}

	@Override
	public Book getByAuthor(String authors) {
		if(!repo.equals(authors)) {throw new AuthorNotFoundException("NO AUTHOR LIKE THAT...");}
		
		return repo.findByAuhtor(authors);
	}

	@Override
	public Book updateBook(Book book) {
		if(repo.existsById(book.getBookId())) {
			throw new DuplicateValueException("Already present  ;");
		}
		
		return repo.save(book);
	}

	@Override
	public void delteBook(int id) {
		if(!repo.existsById(id)) {
			throw new BookNotFoundException("INVALID ID.PLZ ENTER VALID ONE");
		}
		repo.deleteById(id);
		
	}

	@Override
	public List<Book> showAllBook() {
		
		return repo.findAll();
	}

	@Override
	public List<String> showAllAuthors() {
		
		
		return repo.findallAuthors();
	}

	



}