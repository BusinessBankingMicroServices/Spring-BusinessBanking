package com.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.controller.PerController;
import com.person.model.Transfer;
import com.person.repository.IRepository;
import com.person.service.IService;

@Service
public class ServiceImpl implements IService {

    @Autowired IRepository r;
    @Autowired PerController pc;

    @Override
    public Transfer Create(Transfer o) {
        if (this.pc.ExistsAccount(o.getAccountpersonalsend()) == true && this.pc.ExistsAccount(o.getAccountpersonalsend()) == true) {
            o.setDatetransfer("3-6-2022");
            return this.r.save(new Transfer(o.getTransfer(),o.getAccountpersonalsend(), o.getAccountpersonalreception(), o.getCash(), o.getDatetransfer()));
        } else {
            return null;
        }
    }

}
