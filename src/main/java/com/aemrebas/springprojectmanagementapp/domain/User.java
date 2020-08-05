package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Every user belongs to one organization only.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @ManyToMany
    private List<UserRole> roles;

    @ManyToOne
    private Organization organization;

    public User(String firstName, String lastName, String password, List<Tag> tags, Organization organization) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;

        this.organization = organization;
    }

    public User() {
    }


}
