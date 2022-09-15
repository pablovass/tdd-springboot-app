package com.pablovass.service;

import com.pablovass.MongoConfig;
import com.pablovass.entity.Category;
import com.pablovass.entity.Product;
import com.pablovass.repository.ProductRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@Import(MongoConfig.class)
@ActiveProfiles("test")
@SpringBootTest(classes = ProductServiceImpl.class)
@EnableMongoRepositories(basePackageClasses = ProductRepository.class)
class ProductserviceTest {
    @Mock
    private ProductRepository productRepository;

    private Productservice productservice;

    @BeforeEach
    public void setup(){
        MockitoAnnotations.initMocks(this);
        productservice = new ProductServiceImpl(productRepository);

        Product computer =Product.builder()
                .id(1l)
                .name("Computer")
                .category(Category.builder().id(1L).build())
                .stock(Double.parseDouble("10"))
                .price(Double.parseDouble("1230"))
                .status("Create")
                .build();
        Mockito.when(productRepository.findById(1L))
                .thenReturn(Optional.of(computer));

        Mockito.when(productRepository.save(computer)).thenReturn(computer);

    }

    @Test
    @DirtiesContext(methodMode = DirtiesContext.MethodMode.BEFORE_METHOD)
    void whenValidateGetID_ThenreturnProduct() {
        Product found= productservice.getProduct(1L);
        //assertThat(found.getName(),equalTo("computer"));
        assertEquals("computer",found.getName().equals("computer"));
    }
    @Test
    public void whenValidUpdateStock_thenReturnNewStock(){
        Product newStock= productservice.updateStock(1L,Double.parseDouble("8"));
        assertThat(newStock.getStock(),equalTo(10));
    }
}