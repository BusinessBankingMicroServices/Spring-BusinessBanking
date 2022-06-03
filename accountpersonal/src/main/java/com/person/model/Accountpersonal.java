package com.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accountpersonals")
public class Accountpersonal {
    @Id
    private String accountpersonal;
    @Column(name = "dniadmin", nullable = false)
    private String dniadmin;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name = "cash", nullable = false)
    private float cash;
    @Column(name = "password", nullable = false)
    private String password;
}
