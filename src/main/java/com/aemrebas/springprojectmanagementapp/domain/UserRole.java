package com.aemrebas.springprojectmanagementapp.domain;
/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name = "roles")
@Data
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    public UserRole(String name) {
        this.name = name;
    }

    public UserRole() {
    }
}
