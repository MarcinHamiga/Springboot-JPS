package com.example.asi5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.asi5.model.Person;
import com.example.asi5.repository.PersonRepository;

@Service
public class PersonServiceImp implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<Person> getAllPersons() {
        // TODO Auto-generated method stub
        return personRepository.findAll();
    }

    @Override
    public Person getPerson(long id) {
        // TODO Auto-generated method stub
        return personRepository.findById(id).orElseThrow();
    }

    @Override
    public Person addPerson(Person p) {
        // TODO Auto-generated method stub
        return personRepository.save(p);
    }
    
}
