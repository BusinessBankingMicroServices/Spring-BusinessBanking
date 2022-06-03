package com.person.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.controller.PerController;
import com.person.model.Accountpersonal;
import com.person.repository.IRepository;
import com.person.service.IService;

@Service
public class ServiceImpl implements IService {

    @Autowired IRepository r;
    @Autowired PerController pc;

    @Override
    public Accountpersonal Create(Accountpersonal o, String dni) {
        if (this.pc.ExistsPerson(dni) == true) {
            return this.r.save(new Accountpersonal(o.getAccountpersonal(), o.getDniadmin(), o.getType(),o.getCash(),o.getPassword()));
        } else {
            return null;
        }
    }

    @Override
    public boolean ExistsByDni(String dni) {
        return this.r.existsByDniadmin(dni);
    }

    @Override
    public Optional<Accountpersonal> GetById(String accountpersonal) {
        return this.r.findById(accountpersonal);
    }

    @Override
    public boolean ExstId(String accountpersonal) {
        return this.r.existsById(accountpersonal);
    }
}
