package com.pablovass.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
public class Product {

    @Id
    private  Long id;
    private  String name;
    private  String description;
    private  Double stock;
    private  Double price;
    private  String status;

    private Date createAt;

    private Category category;
}
