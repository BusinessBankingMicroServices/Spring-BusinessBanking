package com.person.service;

import java.util.Optional;

import com.person.model.Person;

public interface IPersonService {
    Person Create(Person o);
    Optional<Person> Get(String dni);
    boolean ExistsPerson(String dni);
}
