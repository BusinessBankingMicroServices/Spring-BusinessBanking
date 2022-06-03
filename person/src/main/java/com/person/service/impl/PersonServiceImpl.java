package com.person.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.model.Person;
import com.person.repository.IRepository;
import com.person.service.IPersonService;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired IRepository r;

    @Override
    public Person Create(Person o) {
        return this.r.save(o);
    }

    @Override
    public Optional<Person> Get(String dni) {
        return this.r.findById(dni);
    }

    @Override
    public boolean ExistsPerson(String dni) {
        return this.r.existsById(dni);
    }
}
