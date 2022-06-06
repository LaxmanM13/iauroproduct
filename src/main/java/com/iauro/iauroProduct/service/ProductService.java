package com.iauro.iauroProduct.service;

import com.iauro.iauroProduct.entities.Product;

import java.util.List;

public interface ProductService {


    List<Product> getAllProduct();

    Product getProduct(int id);


}
