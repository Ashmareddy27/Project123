package com.cg.bookapp.exception;

public class InvalidCredentialsException extends RuntimeException{
 
 public InvalidCredentialsException(String msg){
  super(msg);
 }

}