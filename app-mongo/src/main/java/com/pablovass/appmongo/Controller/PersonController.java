package com.pablovass.appmongo.Controller;

import com.pablovass.appmongo.dao.PersonRepository;
import com.pablovass.appmongo.model.Person;
import com.pablovass.appmongo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona/api/v1")
@CrossOrigin("*")
public class PersonController {
    @Autowired
    private PersonService personService;


    @GetMapping(value = "/all")
    public List<Person> getAll() {
        return personService.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Person find(@PathVariable Long id){
        return personService.get(id);
    }
    @PostMapping("/save")
    public ResponseEntity<Person>save(@RequestBody Person person){
        Person obj=personService.save(person);
        return new ResponseEntity<Person>(obj, HttpStatus.OK);
    }
    @DeleteMapping(value="delete/{id}")
    public ResponseEntity<Person> delete(@PathVariable Long id){
        Person person=personService.get(id);
        if(person!=null){
            personService.delete(id);
        }else{
            return  new ResponseEntity<Person>(HttpStatus.NO_CONTENT);
        }return new ResponseEntity<Person>(person,HttpStatus.OK);
    }






}
