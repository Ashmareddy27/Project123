package com.cg.bookapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookapp.model.User;
import com.cg.bookapp.service.UserService;
import com.cg.bookapp.dto.UserCredentials;



@RestController
@RequestMapping("/users")
public class UserController {
 
 @Autowired
 private UserService service;
 
 @ResponseStatus(code= HttpStatus.CREATED)
 @PostMapping("/register")
 public User addUser(@RequestBody User user) {
  return service.addUser(user);
 }
 
 @PostMapping("/authenticate")
 public User authenticateUser(@RequestBody UserCredentials creds) {
  return service.getUserByEmailAndPassword(creds.getEmail(), creds.getPassword());
 }
 
 @GetMapping("/checkExistingUser")
 public User verifyUser(String email, String userName) {
  return service.getUserByEmailAndUserName(email, userName);
 }
}

