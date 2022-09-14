package com.pablovass.repository;

import com.pablovass.entity.Category;
import com.pablovass.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product,Long> {
    // esto remplaza al dao
    public List<Product>findByCategory(Category category); //por categoria
    public List<Product>findByName(Product product); // x nombre

}
