package com.pablovass.repository;

import com.pablovass.entity.Category;
import com.pablovass.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProductRepository extends MongoRepository<Product,Long> {
    // esto remplaza al dao
    public List<Product>findByCategory(Category category); //por categoria
    //public List<Product>findByName(Product product); // x nombre

    //List<Product> findByNProducts(@Param("name") String name);

}
