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
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

/**
 * Every issue belongs to one project only.
 * Every comment belongs to one project only.
 */
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Accessors(chain = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique = true)
    private String name;
    private String description;
    private Date createdAt;

    @ManyToOne
    private Organization organization;

}
