package com.cg.bookapp.exception;

public class AuthorNotFoundException extends RuntimeException {
 public AuthorNotFoundException(String msg) {
	 super(msg);
 }
}
