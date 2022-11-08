package io.github.bzdgn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PersonController {
	
	private final List<Person> persons;
	
	public PersonController() {
		this.persons = new ArrayList<>();
    	
    	persons.add(new Person("Levent", 37));
    	persons.add(new Person("Ronald", 45));
    	persons.add(new Person("Kiki", 34));
    	persons.add(new Person("Sibel", 36));
	}
	
    @GetMapping("/persons")
    public List<Person> getPersons() {
    	return persons;
    }
    
    @PostMapping("/person")
    public Person addPerson(@RequestBody Person p) {
    	this.persons.add(p);
    	
    	return p;
    }

}
