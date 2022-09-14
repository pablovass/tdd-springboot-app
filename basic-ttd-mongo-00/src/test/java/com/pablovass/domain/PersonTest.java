package com.pablovass.domain;

import de.flapdoodle.embed.mongo.config.MongodConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@Import(MongodConfig.class)
//@ActiveProfiles("test")
@SpringBootTest(classes = PersonBusinessImpl.class)
class PersonTest {
    @Value("${person.name}")
    String personName;
    @Value("${person.cpf}")
    Long cpf;
    @Autowired
    private PersonBusiness personBusiness; // nos imaginamos una interfas

    @Test
    void testSavePerson() {
        Person person = new Person();
        personBusiness.save(person);

    }
}