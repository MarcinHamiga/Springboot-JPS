package com.example.asi5.service;

import java.util.List;

import com.example.asi5.model.Person;

public interface PersonService {
    List<Person> getAllPersons();
    Person getPerson(long id);
    Person addPerson(Person p);
}
