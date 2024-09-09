package com.example.SimpleWebProj.service;


import com.example.SimpleWebProj.model.Product;
import com.example.SimpleWebProj.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(int prodId){
        return repo.findByProductId(prodId).orElse(new Product());
    }


    public void addProduct(Product product){
        repo.save(product);
    }

    public void updateProduct(Product product) {
        //save can both useful to add and update
        repo.save(product);
    }

    public void deleteProduct(Product product) {
        repo.delete(product);
    }

//    public void deleteProductById(int prodId) {
//        repo.deleteById(prodId);
//    }
}
