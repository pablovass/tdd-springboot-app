package com.pablovass.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(of="id")
//@Builder
public class Person {
    @Id
    private String id;
    private  Long cpf;
    private String name;

    public Person() {

    }
}
