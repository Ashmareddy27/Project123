package com.cg.bookapp.service;

import com.cg.bookapp.model.User;

public interface UserService {
 
 public User addUser(User user);
 
 public User getUserByEmailAndPassword(String email, String password);
 
 public User getUserByEmailAndUserName(String email,String userName);
}