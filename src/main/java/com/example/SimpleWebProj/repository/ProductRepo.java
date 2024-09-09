package com.example.SimpleWebProj.repository;

import com.example.SimpleWebProj.model.Product;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends MongoRepository<Product, ObjectId> {
    Optional<Product> findByProductId(int productId);
}
