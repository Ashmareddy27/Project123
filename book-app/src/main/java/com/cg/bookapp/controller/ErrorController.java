package com.cg.bookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cg.bookapp.exception.AuthorNotFoundException;
import com.cg.bookapp.exception.BookNotFoundException;
import com.cg.bookapp.exception.DuplicateValueException;

@RestControllerAdvice
public class ErrorController {
	@ExceptionHandler(BookNotFoundException.class)
	@ResponseStatus(code = HttpStatus.NOT_FOUND)
	public String handeledBookNotFoundException(Exception x) {
		return x.getMessage();
	}
	@ExceptionHandler(AuthorNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND)
	public String authorNotFoundException(Exception t) {
		return t.getMessage();
	}


	@ExceptionHandler(DuplicateValueException.class)
	@ResponseStatus(code=HttpStatus.CONFLICT)
	public String duplicatevalueException(Exception exx) {
		return exx.getMessage();
	}

	
	
	
	
	
	
}