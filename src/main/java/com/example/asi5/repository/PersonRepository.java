package com.example.asi5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.asi5.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    

}
