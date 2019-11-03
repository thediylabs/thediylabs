package com.diy.labs.experience.db.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.diy.labs.model.hub.Product;

public interface ProductsRepository extends MongoRepository<Product,String>{
	
	public Product findByProductCode(String productCode);
	public List<Product> findByTag(String tag);

}
