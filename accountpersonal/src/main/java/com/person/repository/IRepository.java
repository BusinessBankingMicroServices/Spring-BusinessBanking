package com.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.model.Accountpersonal;

@Repository
public interface IRepository extends JpaRepository<Accountpersonal, String> {
    boolean existsById(String dni);
    boolean existsByDniadmin(String dni);
}
