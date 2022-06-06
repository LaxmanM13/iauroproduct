package com.iauro.iauroProduct.Controller;


import com.iauro.iauroProduct.entities.Product;
import com.iauro.iauroProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProduct()
    {
        return this.productService.getAllProduct();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id")int id)
    {
        return this.productService.getProduct(id);
    }



}
