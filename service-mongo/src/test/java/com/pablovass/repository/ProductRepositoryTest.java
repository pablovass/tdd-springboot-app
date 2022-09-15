package com.pablovass.repository;

import com.pablovass.MongoConfig;
import com.pablovass.entity.Category;
import com.pablovass.entity.Product;
import com.pablovass.service.ProductServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.Date;
import java.util.List;

@Import(MongoConfig.class)
@ActiveProfiles("test")
@SpringBootTest(classes = ProductServiceImpl.class)
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
class ProductRepositoryTest {

    @Autowired
    private  ProductRepository productRepository;

    @Test @DisplayName("cuando busque la categoria retorna producto")
    void whenFindByCategory_thenReturnListProduct() {
        Product product=Product.builder()
                .name("Computer")
                .category(Category.builder().id(1L).build())
                .description(" la mejor pc")
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1230"))
                .status("Create")
                .createAt(new Date())
                .build();

        productRepository.save(product);

        List<Product> founds=productRepository.findByCategory(product.getCategory());

        assertThat(founds.size(),equalTo(1));

    }
}