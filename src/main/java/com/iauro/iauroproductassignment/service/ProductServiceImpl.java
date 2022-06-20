package com.iauro.iauroproductassignment.service;

import com.iauro.iauroproductassignment.entities.Product;
import com.iauro.iauroproductassignment.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {


//   @Autowired
//   private ProductRepository productRepository;

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String name) {
        return productRepository.findByName(name);
    }

	@Override
	public Product save(Product product) {
		return productRepository.save(product);
	}


}
