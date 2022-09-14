package com.pablovass;

import com.pablovass.model.Person;
import com.pablovass.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class DemoMongoEnbeddedApplication  implements CommandLineRunner {

	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoMongoEnbeddedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.insert(new Person(1,"jose","perez","BA"));
		personRepository.insert(new Person(2,"jose","perez","BA"));
		personRepository.insert(new Person(3,"jose","perez","BA"));

		System.out.println("datos insertado de forma envevida");

		List<Person>s=personRepository.findAll();

		Iterator<Person>irt=s.iterator();

		while(irt.hasNext()){
			System.out.println(irt.next().toString());
		}

	}
}
