package com.iauro.iauroProduct.service;

import com.iauro.iauroProduct.entities.Product;
import com.iauro.iauroProduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {


   @Autowired
   private ProductRepository productRepository;
    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.findById(id).get();
    }


}
