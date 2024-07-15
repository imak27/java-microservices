package com.angad.microservices.product.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.angad.microservices.product.model.Product;

public interface ProductRepository extends MongoRepository<Product,String>{
    
}
