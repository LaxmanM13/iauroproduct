package com.iauro.iauroproductassignment.service;



import com.iauro.iauroproductassignment.entities.Product;

import java.util.List;

public interface ProductService {


    List<Product> getAllProduct();

    Product getProduct(String name);

	Product save(Product product);

}
