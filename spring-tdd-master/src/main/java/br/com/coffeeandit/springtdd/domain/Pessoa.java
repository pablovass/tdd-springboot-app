package br.com.coffeeandit.springtdd.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@EqualsAndHashCode(of = "id")
@Builder @AllArgsConstructor @NoArgsConstructor
public class Pessoa {

    @Id
    private String id;
    private Long cpf;
    private String nome;

}
