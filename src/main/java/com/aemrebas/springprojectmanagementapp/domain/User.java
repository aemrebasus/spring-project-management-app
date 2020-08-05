package com.aemrebas.springprojectmanagementapp.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String first_name;
    private String last_name;
    private String password;

    @ManyToOne
    private Organization organization;

}
