package com.cg.bookapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.bookapp.model.Book;

public interface IBookRepository extends JpaRepository<Book, Integer> {
	@Query("from Book where authors=:authors")
	public Book findByAuhtor(String authors);
	@Query("select authors from Book")
	public List<String> findallAuthors();

}