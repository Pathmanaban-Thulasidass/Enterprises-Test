package com.example.SimpleWebProj.model;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Product {
    @Id
    private ObjectId _id;
    private int productId;
    private String productName;
    private double productPrice;
}
