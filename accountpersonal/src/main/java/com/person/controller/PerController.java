package com.person.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "person-service", url = "http://localhost:8080/Api/Person/")
public interface PerController {

    @GetMapping("ExistsPerson/{dni}")
    public boolean ExistsPerson(@PathVariable String dni);
    
}
