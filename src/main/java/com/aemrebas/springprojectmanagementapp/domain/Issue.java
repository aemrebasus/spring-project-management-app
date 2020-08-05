package com.aemrebas.springprojectmanagementapp.domain;

import javax.persistence.*;

@Entity
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    private Organization organization;

    @ManyToOne
    private User user;

    @ManyToOne
    private Project project;

    public Issue(String title, String description, Organization organization, User user, Project project) {
        this.title = title;
        this.description = description;
        this.organization = organization;
        this.user = user;
        this.project = project;
    }
}
