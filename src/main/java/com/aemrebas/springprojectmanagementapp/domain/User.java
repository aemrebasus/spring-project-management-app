package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/
import lombok.Data;
import javax.persistence.*;

/**
 * Every user belongs to one organization only.
 */
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
