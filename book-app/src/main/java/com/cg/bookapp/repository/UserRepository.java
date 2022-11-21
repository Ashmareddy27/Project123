package com.cg.bookapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookapp.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

 public User findByEmailAndPassword(String email, String password);
 
 public User findByEmailAndUserName(String email, String userName);
}