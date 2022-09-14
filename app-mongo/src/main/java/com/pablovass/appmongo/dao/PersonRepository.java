package com.pablovass.appmongo.dao;
import com.pablovass.appmongo.model.Person;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person,Long > {

}
