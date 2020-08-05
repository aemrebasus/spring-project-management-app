package com.aemrebas.springprojectmanagementapp.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;
    private Date createdAt;

    @ManyToOne
    private Organization organization;

    @ManyToOne
    private User user;

    @ManyToOne
    private Issue issue;

    @ManyToOne
    private Project project;


    public Comment(String content, Date createdAt, Organization organization, User user, Issue issue, Project project) {
        this.content = content;
        this.createdAt = createdAt;
        this.organization = organization;
        this.user = user;
        this.issue = issue;
        this.project = project;
    }
}
