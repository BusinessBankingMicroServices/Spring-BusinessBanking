package com.person.controller;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.person.model.Accountpersonal;

@FeignClient(name = "accountpersonal-service", url = "http://localhost:8081/Api/Accountpersonal/")
public interface PerController {

    @GetMapping("ExistsId/{accountpersonal}")
    public boolean ExistsAccount(@PathVariable String accountpersonal);

    @GetMapping("GetById/{accountpersonal}")
    public Optional<Accountpersonal> GetById(@PathVariable String accountpersonal);    
}
