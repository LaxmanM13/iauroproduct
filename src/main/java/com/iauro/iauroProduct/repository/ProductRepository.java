package com.iauro.iauroProduct.repository;

import com.iauro.iauroProduct.entities.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, Integer> {

}
