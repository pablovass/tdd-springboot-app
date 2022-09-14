package br.com.coffeeandit.springtdd.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(of = "id")
@Builder
public class Pessoa {

    @Id
    private String id;
    private Long cpf;
    private String nome;

}
