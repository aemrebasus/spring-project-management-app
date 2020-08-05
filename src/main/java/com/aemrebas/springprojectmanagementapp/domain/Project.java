package com.aemrebas.springprojectmanagementapp.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private Date createdAt;

    @ManyToOne
    private Organization organization;

    public Project(String name, String description, Date createdAt, Organization organization) {
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.organization = organization;
    }
}
