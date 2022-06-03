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
@Table(name = "transfer")
public class Transfer {
    @Id
    private Integer transfer;
    @Column(name = "accountpersonalsend", nullable = false)
    private String accountpersonalsend;
    @Column(name = "accountpersonalreception", nullable = false)
    private String accountpersonalreception;
    @Column(name = "cash", nullable = false)
    private float cash;
    @Column(name = "datetransfer", nullable = false)
    private String datetransfer;
}
