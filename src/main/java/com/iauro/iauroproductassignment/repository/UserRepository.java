package com.iauro.iauroproductassignment.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.iauro.iauroproductassignment.entities.Product;
import com.iauro.iauroproductassignment.entities.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	 
    Optional<User> findByEmail(String email);

}
