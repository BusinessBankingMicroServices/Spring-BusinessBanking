package com.person.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.model.Person;
import com.person.service.IPersonService;

@RestController
@RequestMapping("Api/Person")
public class Controller {

    @Autowired IPersonService s;

    @PostMapping("/Create")
    public Person Create(@RequestBody Person o) {
        Person temp = this.s.Create(o);
        return temp;
    }

    @GetMapping("GetPerson/{dni}")
    public Optional<Person> GetPerson(@PathVariable String dni) {
        Optional<Person> temp = this.s.Get(dni);
        return temp;
    }

    @GetMapping("ExistsPerson/{dni}")
    public boolean ExistsPerson(@PathVariable String dni) {
        boolean temp = this.s.ExistsPerson(dni);
        return temp;
    }
}
