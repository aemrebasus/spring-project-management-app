package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/
import lombok.Data;
import javax.persistence.*;
import java.util.Date;

/**
 * Every issue belongs to one project only.
 * Every comment belongs to one project only.
 */
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

    public Project(){}
}
