package com.iauro.iauroProduct.Controller;


import com.iauro.iauroProduct.entities.Product;
import com.iauro.iauroProduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public Product getProduct(@PathVariable("id")String id)
    {
        return this.productService.getProduct(id);
    }




}
