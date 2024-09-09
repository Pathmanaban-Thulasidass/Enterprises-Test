package com.example.SimpleWebProj.controller;


import com.example.SimpleWebProj.model.Product;
import com.example.SimpleWebProj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController{

    @Autowired
    ProductService productService;

//    @RequestMapping("/products")
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }

//    @RequestMapping("/products/{prodId}")
    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return productService.getProductById(prodId);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        System.out.println(product);
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/products")
    public void deleteProduct(@RequestBody Product product){
        System.out.println(product);
        productService.deleteProduct(product);
    }

//    @DeleteMapping("/products/{prodId}")
//    public void deleteProductById(@PathVariable int prodId){
//        productService.deleteProductById(prodId);
//    }

}
