package com.person.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.person.model.Transfer;

@Repository
public interface IRepository extends JpaRepository<Transfer, Integer> {
    List<Transfer> findByAccountpersonalsend(String accountpersonalsend);
    List<Transfer> accountpersonalreception(String accountpersonalreception);
}
