package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import javax.persistence.*;
import java.util.List;

/**
 * Each issue is assigned to one user, one project and one organization.
 * The user and project must belongs to the organization.
 */
@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;

    @ManyToMany
    private List<Tag> tags;

    @ManyToOne
    private User user;

    @ManyToOne
    private Project project;


    public Issue(String title, String description, User user, Project project) {
        this.title = title;
        this.description = description;
        this.user = user;
        this.project = project;
    }

    public Issue() {
    }
}
