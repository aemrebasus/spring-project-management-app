package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Each comment belongs to one user and one issue.
 * It is not necessarily that the issue is assigned to the user
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;
    private Date createdAt;

    @ManyToMany
    private List<Tag> tags;

    @ManyToOne
    private User user;

    @ManyToOne
    private Issue issue;

    @ManyToOne
    private Project project;

}
