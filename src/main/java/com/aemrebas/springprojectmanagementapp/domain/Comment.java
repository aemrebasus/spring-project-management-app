package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/
import javax.persistence.*;
import java.util.Date;

/**
 * Each comment belongs to one user and one issue.
 * It is not necessarily that the issue is assigned to the user
 */
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
