package com.pablovass.appmongo.service;

import com.pablovass.appmongo.commons.GenericServiceApi;
import com.pablovass.appmongo.commons.GenericServiceImpl;
import com.pablovass.appmongo.dao.PersonRepository;
import com.pablovass.appmongo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends GenericServiceImpl<Person, Long> implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public CrudRepository<Person, Long> getDao() {
        return personRepository;
    }
}
