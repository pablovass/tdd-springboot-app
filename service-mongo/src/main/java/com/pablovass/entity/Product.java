package com.pablovass.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @Id
    private Long id;
    private String name;
    private String description;
    private Double stock;
    private Double price;
    private String status;

    private Date createAt;

    @JsonIgnoreProperties({"hibernateLazyinitializer", "handler"})
    private Category category;
}
