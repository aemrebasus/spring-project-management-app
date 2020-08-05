package com.aemrebas.springprojectmanagementapp.domain;/*
 @project spring-project-management-app
 @author Ahmet Emrebas on 8/5/2020
 @since 1.0.0 
*/

import lombok.Data;
import org.springframework.stereotype.Indexed;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @ManyToMany(mappedBy = "tags")
    private List<Issue> issues;

    public Tag(String name) {
        this.name = name;
    }

    public Tag() {
    }
}
