package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/
import lombok.Data;
import javax.persistence.*;

/**
 * Organization is the top level entity
 * All the entities belong to one organization only.
 */
@Entity
@Data
public class Organization {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    public Organization(String name) {
        this.name = name;
    }
}
