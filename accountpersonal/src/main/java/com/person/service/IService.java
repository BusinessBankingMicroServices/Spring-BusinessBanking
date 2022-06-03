package com.person.service;

import java.util.Optional;

import com.person.model.Accountpersonal;

public interface IService {
    Accountpersonal Create(Accountpersonal o, String dni);
    boolean ExistsByDni(String accountpersonal);
    boolean ExstId(String accountpersonal);
    Optional<Accountpersonal> GetById(String accountpersonal);
}
