package com.iauro.iauroproductassignment.controller;



import com.iauro.iauroproductassignment.entities.Product;
import com.iauro.iauroproductassignment.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //    @Autowired
//    private ProductService productService;
    private final ProductService productService;


    @GetMapping("/products")
    public List<Product> getAllProduct()
    {
        return this.productService.getAllProduct();
    }

    @GetMapping("/products/{name}")
    public Product getProduct(@PathVariable("name")String name)
    {
        return this.productService.getProduct(name);
    }
    
    @PostMapping("/products")
    public Product create(@RequestBody Product product)
    {
    	return this.productService.save(product);
    }
    




}
