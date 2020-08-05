package com.aemrebas.springprojectmanagementapp.domain;


import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String content;

    private Date created_at;


    @ManyToOne
    private Organization organization;

    @ManyToOne
    private User user;

    @ManyToOne
    private Issue issue;

    @ManyToOne
    private Project project;


}
