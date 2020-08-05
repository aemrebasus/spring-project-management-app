package com.aemrebas.springprojectmanagementapp.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String lastName;
    private String password;

    @ManyToOne
    private Organization organization;

    public User(String firstName, String lastName, String password, Organization organization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.organization = organization;
    }

    public User(){}
}
