package com.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.model.Transfer;
import com.person.service.IService;

@RestController
@RequestMapping("Api/Transfer")
public class Controller {

    @Autowired IService s;

    @PostMapping("/Create")
    public Transfer Create(@RequestBody Transfer o) {
        return this.s.Create(o);
    }

/*     @GetMapping("FindAllReception/{accountpersonal}")
    public Optional<Transfer> GetById(@PathVariable String accountpersonal) {
        return this.s.GetById(accountpersonal);
    } */
}
