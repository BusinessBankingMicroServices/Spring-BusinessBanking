package com.person.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.model.Accountpersonal;
import com.person.service.IService;

@RestController
@RequestMapping("Api/Accountpersonal")
public class Controller {

    @Autowired IService s;

    @PostMapping("/Create")
    public Accountpersonal Create(@RequestBody Accountpersonal o) {
        Accountpersonal temp = this.s.Create(new Accountpersonal(o.getAccountpersonal(), o.getDniadmin(), o.getType(),o.getCash(),o.getPassword()),o.getDniadmin());
        return temp;
    }

    @GetMapping("ExistsByDni/{accountpersonal}")
    public boolean GetPerson(@PathVariable String accountpersonal) {
        boolean temp = this.s.ExistsByDni(accountpersonal);
        return temp;
    }

    @GetMapping("GetById/{accountpersonal}")
    public Optional<Accountpersonal> GetById(@PathVariable String accountpersonal) {
        return this.s.GetById(accountpersonal);
    }

    @GetMapping("ExistsId/{accountpersonal}")
    public boolean ExistId(@PathVariable String accountpersonal) {
        boolean temp = this.s.ExstId(accountpersonal);
        return temp;
    }
}
