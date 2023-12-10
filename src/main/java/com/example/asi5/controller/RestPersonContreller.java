package com.example.asi5.controller;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.asi5.repository.PersonRepository;
import com.example.asi5.service.PersonService;

import jakarta.websocket.server.PathParam;

import com.example.asi5.model.Person;

import java.util.*;

@RestController
@RequestMapping("/api/person")
public class RestPersonContreller {
    
    @Autowired
    PersonService personService;

    @GetMapping("/")
    public ResponseEntity<List<Person>> getAlPerson(){
        return ResponseEntity.ok().body(personService.getAllPersons());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Person> getPerson(@PathParam("id") long id){
        return ResponseEntity.ok().body(personService.getPerson(id));
    }

}
