package com.aemrebas.springprojectmanagementapp.domain;
/*
 @author Ahmet Emrebas on 8/5/2020
 @project spring-project-management-app
 @since 1.0.0
*/

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Each issue is assigned to one user, one project and one organization.
 * The user and project must belongs to the organization.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Issue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private LocalDateTime createdAt;

    @ManyToMany
    private List<Tag> tags;

    @ManyToMany
    private List<User> contributors;

    @ManyToOne
    private User user;

    @ManyToOne
    private Project project;
}
